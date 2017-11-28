package be.cegeka.selfeval5.domain;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private Service service;

    @Mock
    private Repository repository;

    @Mock
    private User user;

    @Mock
    private Highway highway;

    @Test
    public void whenCallingServiceGetAllHighWaysRepositoryGetAllHighWaysShouldBeCalled() throws Exception {
        service.getAllHighway();
        verify(repository).getAllHighway();
    }

    @Test
    public void whenCallingServiceReportIncidentRepositoryReportIncidentShouldBeCalled() throws Exception {
        when(repository.getUserByID(1)).thenReturn(user);
        when(repository.getHighwayByID(1)).thenReturn(highway);
        service.reportIncident(1, 1, "incident", "ongeval", 10);
        verify(user).addUserIncident(Mockito.refEq(new Incident("incident","ongeval",10)));
        verify(highway).addHighwayIncident(Mockito.refEq(new Incident("incident","ongeval",10)));
    }

    @Test
    public void whenCallingServiceGetAllIncidentsForUserUserGetIncidentsIsCalled() throws Exception {
        Incident test= new Incident("testongeval","ongeval",20);
        List<Incident> testlist=new ArrayList<>();
        testlist.add(test);
        when(repository.getUserByID(1)).thenReturn(user);
        when(user.getIncidents()).thenReturn(testlist);
        Assertions.assertThat(user.getIncidents()).contains(test);
    }

}
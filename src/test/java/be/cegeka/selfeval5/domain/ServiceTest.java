package be.cegeka.selfeval5.domain;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class ServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private Service service;

    @Mock
    private Repository repository;

    @Test
    public void whenCallingServiceGetAllHighWaysRepositoryGetAllHighWaysShouldBeCalled() throws Exception {
        service.getAllHighway();
        verify(repository).getAllHighway();
    }
}
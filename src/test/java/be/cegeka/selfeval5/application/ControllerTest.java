package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.domain.Service;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.inject.Named;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
@Named
public class ControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private Controller controller;

    @Mock
    private Service service;

    @Test
    public void whenCallingControllerGetAllHighWaysShouldCallServiceGetAllHighways() throws Exception {
        controller.getAllHighways();
        verify(service).getAllHighway();
    }
}
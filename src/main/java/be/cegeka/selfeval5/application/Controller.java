package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.domain.Highway;
import be.cegeka.selfeval5.domain.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping(path = "/trafficjam")
@Transactional
public class Controller {
    @Inject
    private Service service;

    @GetMapping(path="/getallhighway")
    public List<Highway> getAllHighways() {
        return service.getAllHighway();
    }
}

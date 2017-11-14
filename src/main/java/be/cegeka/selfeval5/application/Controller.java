package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.domain.Highway;
import be.cegeka.selfeval5.domain.Service;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping(path = "/trafficjam")
@Transactional
public class Controller {
    @Inject
    private Service service;

    @GetMapping(path = "/getallhighway")
    public List<Highway> getAllHighways() {
        return service.getAllHighway();
    }

    @PostMapping(path = "/reportincident")
    public void reportIncident(
            @RequestParam(value = "customerid", required = true) int userid,
            @RequestParam(value = "highwayid") int highwayid,
            @RequestParam(value = "incidentname") String name,
            @RequestParam(value = "type", required = true) String type,
            @RequestParam(value = "distance", required = true) double distance){
        service.reportIncident(userid,highwayid,name,type,distance);
    }
}

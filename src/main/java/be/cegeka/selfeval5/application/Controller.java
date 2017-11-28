package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.domain.Highway;
import be.cegeka.selfeval5.domain.Incident;
import be.cegeka.selfeval5.domain.Service;
import be.cegeka.selfeval5.domain.User;
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
            @RequestParam(value = "distance", required = true) double distance) {
        service.reportIncident(userid, highwayid, name, type, distance);
    }

    @GetMapping(path = "/getAllReportedIncidentsForUser/{userId}")
    public List<Incident> getAllIncidentsForUser(@PathVariable("userId") int userId) {
        return service.getAllIncidentsForUser(userId);
    }

    @PostMapping(path = "/confirmIncident")
    public void confirmIncident(
            @RequestParam(value = "userId", required = true) int userId,
            @RequestParam(value = "incidentId", required = true) int incidentId) {
        service.confirmIncident(userId, incidentId);
    }

    @GetMapping(path = "/getAllUserWhoReportedIncident/{incidentId}")
    public List<User> getAllUsersWhoReportedIncident(@PathVariable("incidentId") int incidentId) {
        return service.getAllUsersWhoReportedIncident(incidentId);
    }
}

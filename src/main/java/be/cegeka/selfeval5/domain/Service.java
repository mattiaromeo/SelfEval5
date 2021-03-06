package be.cegeka.selfeval5.domain;

import com.sun.org.apache.regexp.internal.RE;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class Service {
    @Inject
    private Repository repository;

    public List<Highway> getAllHighway(){
        return repository.getAllHighway();
    }

    public void reportIncident(int userid, int highwayid,String name, String type, double distance) {
        User selectedUser= repository.getUserByID(userid);
        Highway selectedHighway=repository.getHighwayByID(highwayid);
        Incident newIncident=new Incident(name,type,distance);
        selectedUser.addUserIncident(newIncident);
        selectedHighway.addHighwayIncident(newIncident);
    }

    public List<Incident> getAllIncidentsForUser(int userId) {
        User selectedUser= repository.getUserByID(userId);
        return selectedUser.getIncidents();
    }

    public void confirmIncident(int userId, int incidentId) {
        Incident selectedIncident=repository.getIncidentById(incidentId);
        User selectedUser=repository.getUserByID(userId);
        selectedUser.addUserIncident(selectedIncident);
    }

    public List<User> getAllUsersWhoReportedIncident(int incidentId) {
        return repository.getAllUsersWhoReportedIncident(incidentId);
    }
}

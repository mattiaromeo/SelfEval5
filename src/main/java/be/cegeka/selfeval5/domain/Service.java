package be.cegeka.selfeval5.domain;

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
}

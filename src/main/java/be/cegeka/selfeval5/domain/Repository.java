package be.cegeka.selfeval5.domain;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public List<User> getAllUsers() {
        return entityManager
                .createQuery("select u from User u", User.class)
                .getResultList();
    }


    public List<Highway> getAllHighway() {
        return entityManager
                .createQuery("select h from Highway h", Highway.class)
                .getResultList();
    }

    public void addHighway(Highway highway) {
        entityManager.persist(highway);
    }

    public User getUserByID(int userid) {
        return entityManager
                .createQuery("select u from User u where u.id=:userid", User.class)
                .setParameter("userid", userid)
                .getSingleResult();
    }

    public Highway getHighwayByID(int highwayid) {
        return entityManager
                .createQuery("select h from Highway h where h.id=:highwayid", Highway.class)
                .setParameter("highwayid", highwayid)
                .getSingleResult();
    }

    public void addIncident(Incident incident) {
        entityManager.persist(incident);
    }

    public List<Incident> getAllIncidents() {
        return entityManager
                .createQuery("select i from Incident i", Incident.class)
                .getResultList();
    }

    public Incident getIncidentById(int incidentId) {
        return entityManager
                .createQuery("select i from Incident i where i.id=:incidentId ", Incident.class)
                .setParameter("incidentId", incidentId)
                .getSingleResult();
    }

    public List<User> getAllUsersWhoReportedIncident(int incidentId){
        return entityManager
                .createQuery("select u from User u join u.incidents as i where i.id=:incidentId",User.class)
                .setParameter("incidentId",incidentId)
                .getResultList();
    }


//    select userid from user_incidents where incidentid:=incidentid
}

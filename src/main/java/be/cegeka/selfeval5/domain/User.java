package be.cegeka.selfeval5.domain;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "USERID")
//    private List<Incident> userIncident;
    @JoinTable(name = "USER_INCIDENT",
            joinColumns ={@JoinColumn(name="userid")} ,
            inverseJoinColumns ={@JoinColumn(name="incidentid")} )
    private List<Incident> incidents= new ArrayList<Incident>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addUserIncident(Incident incident) {

        incidents.add(incident);
    }

    public List<Incident> getIncidents() {
        return incidents;
    }
}

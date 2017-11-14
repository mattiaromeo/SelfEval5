package be.cegeka.selfeval5.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @ManyToMany
    @JoinColumn(name="USERID")
    private List<Incident> userIncident;

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

    public void setUserIncident(List<Incident> userIncident) {
        this.userIncident = userIncident;
    }
}

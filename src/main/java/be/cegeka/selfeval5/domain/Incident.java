package be.cegeka.selfeval5.domain;

import javax.inject.Named;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INCIDENT")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="TYPE")
    private String type;
    @Column(name="DISTANCE")
    private double distance;
//    @ManyToMany(mappedBy="incidents",cascade = CascadeType.ALL)
//    private List<User> users = new ArrayList<User>();


    public Incident() {
    }

    public Incident(String name, String type, double distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getDistance() {
        return distance;
    }

//    public List<User> getUsers() {
//        return users;
//    }
}

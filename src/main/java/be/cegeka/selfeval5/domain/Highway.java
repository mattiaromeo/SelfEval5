package be.cegeka.selfeval5.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name="HIGHWAY")
public class Highway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="DISTANCE")
    private double distance;

    public Highway() {
    }

    public Highway(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }
}
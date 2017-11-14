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
}

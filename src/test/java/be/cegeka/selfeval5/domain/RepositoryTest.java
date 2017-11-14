package be.cegeka.selfeval5.domain;

import be.cegeka.selfeval5.Application;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class RepositoryTest {
    private User user1;
    private User user2;
    private User user3;
    private Highway highway1;
    private Highway highway2;
    private Highway highway3;

    @Inject
    private Repository repository;

    @PersistenceContext
    private EntityManager entityManager;

    @Before
    public void setUp() throws Exception {
        user1=new User("jef");
        user2=new User("jan");
        entityManager.persist(user1);
        entityManager.persist(user2);

        user3=new User("an");

        highway1=new Highway();
        highway2=new Highway();
        entityManager.persist(highway1);
        entityManager.persist(highway2);

        highway3=new Highway();

    }

    @Test
    public void getAllUsersShouldReturnListOfUsers() throws Exception {
        assertThat(repository.getAllUsers()).contains(user1,user2);
    }

    @Test
    public void addUserShouldAddUserToDB() throws Exception {
        repository.addUser(user3);
        assertThat(repository.getAllUsers()).contains(user3);
    }



    @Test
    public void getallHighwaysShouldReturnListOfHighways() throws Exception {
        assertThat(repository.getAllHighway()).contains(highway1,highway2);
    }

    @Test
    public void addHighWayShouldAddHighwayToDB() throws Exception {
        repository.addHighway(highway3);
        assertThat(repository.getAllHighway()).contains(highway3);
    }
}
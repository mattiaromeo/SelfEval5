package be.cegeka.selfeval5.domain;

import be.cegeka.selfeval5.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class RepositoryTest {

    @Test
    public void CreateUserShouldAddUserToDB() throws Exception {
    }

    @Test
    public void getAllUsersShouldReturnListOfUsers() throws Exception {
    }
}
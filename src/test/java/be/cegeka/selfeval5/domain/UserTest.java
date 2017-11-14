package be.cegeka.selfeval5.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;
@Named
public class UserTest {
    private User user1;
    private User user2;
    private User user3;


    @Before
    public void setUp() throws Exception {
        user1=new User("jef");
    }

    @Test
    public void getNameShouldReturnName() throws Exception {
        Assertions.assertThat(user1.getName()).isEqualTo("jef");
    }

}
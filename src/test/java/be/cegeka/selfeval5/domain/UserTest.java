package be.cegeka.selfeval5.domain;

import org.assertj.core.api.Assertions;
import org.junit.*;

import static org.junit.Assert.*;

public class UserTest {
    private User user1;


    @Before
    public void setUp() throws Exception {
        user1 = new User("jef");
    }

    @Test
    public void getIdShouldReturnId() throws Exception {
        Assertions.assertThat(user1.getId()).isEqualTo(0);
    }

    @Test
    public void getNameShouldReturnName() throws Exception {
        Assertions.assertThat(user1.getName()).isEqualTo("jef");
    }

}
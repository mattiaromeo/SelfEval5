package be.cegeka.selfeval5.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private User user;

    @Before
    public void setUp() throws Exception {
        user=new User("jef");
    }

    @Test
    public void UserGetNameShouldReturnName() throws Exception {
        Assertions.assertThat(user.getName()).isEqualTo("jef");
    }
}
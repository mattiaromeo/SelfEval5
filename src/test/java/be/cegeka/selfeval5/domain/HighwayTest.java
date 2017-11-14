package be.cegeka.selfeval5.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighwayTest {
    private Highway highway1;

    @Before
    public void setUp() throws Exception {
        highway1=new Highway("snelweg",500);
    }

    @Test
    public void getIdShouldReturnId() throws Exception {
        Assertions.assertThat(highway1.getId()).isEqualTo(0);
    }

    @Test
    public void getNameShouldReturnName() throws Exception {
        Assertions.assertThat(highway1.getName()).isEqualTo("snelweg");
    }

    @Test
    public void getDistanceShouldReturnDistance() throws Exception {
        Assertions.assertThat(highway1.getDistance()).isEqualTo(500);
    }
}
package PandM_SWR;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    public void planetTest(){
        ArrayList<Moon> mooons = new ArrayList<>();
        Planet earth = new Planet(1, 2, 2, 2);
        assertAll(
                () -> assertEquals(1, earth.getMoons()),
                () -> assertEquals(2, earth.getDistanceToSun()),
                () -> assertEquals(2, earth.getCircumference()),
                () -> assertEquals(2, earth.getDiameter()),
                () -> assertEquals(1, earth.getMooon())
        );
    }

    @Test
    public void test1(){
        Planet jupiter = new Planet(67, 2, 439000, 139000);
        Planet pluto = new Planet(2, 7, 21000, 6700);
        assertEquals(5, jupiter.planetTestDistance(pluto));
    }
}
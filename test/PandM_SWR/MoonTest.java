package PandM_SWR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest{

    @Test
    public void MoonTest() {
        Moon m = new Moon(1, 2, 3);
        assertEquals(2, m.getCircumference());
        assertEquals(3, m.getDiameter());
        assertEquals(1 ,m.getDistanceToSun());
    }
}
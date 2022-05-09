import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void testDrink(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void testEmptyDrink(){
        myBottle.emptyDrink();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void testFillDrink(){
        myBottle.fillDrink();
        assertEquals(100, myBottle.getVolume());
    }

}

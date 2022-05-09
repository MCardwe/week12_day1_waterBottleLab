import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(8, 6));
    }

    @Test
    public void testMultiply(){
        assertEquals(20, calculator.multiply(10, 2));
    }

    @Test
    public void testDivide(){
        assertEquals(10, calculator.divide(20, 2), 0.01);
    }

}

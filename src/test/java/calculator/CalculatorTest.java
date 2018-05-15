package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void testCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorExist(){
        assertNotNull(calculator);
    }

    @Test
    public void testAddition(){
        assertEquals(4,calculator.addition(1,2));
    }
    @Test
    public void testSubtraction(){
        assertEquals(5,calculator.subtraction(10,5));
    }
    @Test
    public void testMultiplication(){
        assertEquals(24,calculator.multiplication(6,4),2.5);
    }
    @Test
    public void testDivision(){
        assertEquals(3,calculator.division(6,2),1);
        assertEquals(2.5,calculator.division(5,2),0.5);
    }



}

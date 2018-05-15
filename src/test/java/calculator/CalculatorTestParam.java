package calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//@RunWith(Parameterized.class)
public class CalculatorTestParam {

    Calculator calculator;
    public int fInput;
    public int fExpected;

    @Before
    public void testCalculator(){
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0}, {1, 2}, {3, 6}, {5, 10}});
    }

        @Test
        public void testCalculatorExist(){
            assertNotNull(calculator);
        }
        @Test
        public void testAddition(){
            assertEquals(fExpected,calculator.addition(fInput,fInput));
            System.out.println(fExpected);
        }
        @Test
        public void testSubtraction(){
            assertEquals(fExpected,calculator.subtraction(fInput,fInput));
            System.out.println(fExpected);
        }
        @Test
        public void testMultiplication(){
            assertEquals(fExpected,calculator.multiplication(fInput,fInput),0.5);
            System.out.println(fExpected);
        }
        @Test
        public void testDivision(){
            try {
                assertEquals(fExpected, calculator.division(fInput, fInput), 2.5);
                System.out.println(fExpected);
            }catch (ArithmeticException a){
                a.printStackTrace();
            }
        }

}



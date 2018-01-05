import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    Calculator calculator;



    @Before
    public void init()
    {
        calculator = new Calculator();

    }

    @Test
    public void testPlusOperation()
    {
        int testOperation = calculator.performOperations("plus",8,8);

        Assert.assertEquals(testOperation,16);
    }

    @Test
    public void testMinusOperation()
    {
        int testOperation = calculator.performOperations("minus",8,8);

        Assert.assertEquals(testOperation,0);
    }

    @Test
    public void testMultiplyOperation()
    {
        int testOperation = calculator.performOperations("multiply",8,8);

        Assert.assertEquals(testOperation,64);
    }

    @Test
    public void testDivideOperation()
    {
        int testOperation = calculator.performOperations("divide",16,2);
        //when(calculator1.error(2,1)).thenReturn(1);
        Assert.assertEquals(testOperation,8);
    }

    @Test(expected = RuntimeException.class)
    public void testElseOperation()
    {
        int testOperation = calculator.performOperations("jffkjfg",8,8);
    }


}

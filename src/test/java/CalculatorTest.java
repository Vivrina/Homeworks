import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void sum_2Plus5_7Returned() {
        String[] args = {"2", "+", "5"};
        int result = Calculator.calculate(args);
        Assert.assertEquals(result, 7);
    }
    @Test
    public void sub_10Minus5_5Returned() {
        String[] args = {"10", "-", "5"};
        int result = Calculator.calculate(args);
        Assert.assertEquals(result, 5);
    }
    @Test
    public void mult_3Multiply2_6Returned() {
        String[] args = {"3", "*", "2"};
        int result = Calculator.calculate(args);
        Assert.assertEquals(result, 6);
    }
    @Test
    public void div_40Divide5_8Returned() {
        String[] args = {"40", "/", "5"};
        int result = Calculator.calculate(args);
        Assert.assertEquals(result, 8);
    }

}
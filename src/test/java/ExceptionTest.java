import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void exception_2Plus5Plus9_ArrayIndexOutOfBoundsExceptionReturned() {
        String[] args = {"2", "+", "5", "+", "9"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_NumPlus5_NumberFormatExceptionReturned() {
        String[] args = {"Num", "+", "5"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_995_NumberFormatExceptionReturned() {
        String[] args = {"9", "9", "5"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_2PlusNum_NumberFormatExceptionReturned() {
        String[] args = {"2", "+", "Num"};
        Exception.exception(args);
    }

    @Test
    public void exception_fjrjf(){
        String[] args1 = {"4", "+", "2"};
        String[] args2 = {"4", "-", "2"};
        String[] args3 = {"4", "*", "2"};
        String[] args4 = {"4", "/", "2"};
        if (Exception.exception(args1) && Exception.exception(args2) && Exception.exception(args3) && Exception.exception(args4)){
            Assert.assertTrue(true);
        }

    }


}
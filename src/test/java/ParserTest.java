import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void parser_2Plus5Plus9_ArrayIndexOutOfBoundsExceptionReturned() {
        String[] args = {"2", "+", "5", "+", "9"};
        Parser.parser(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_NumPlus5_NumberFormatExceptionReturned() {
        String[] args = {"Num", "+", "5"};
        Parser.parser(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_995_NumberFormatExceptionReturned() {
        String[] args = {"9", "9", "5"};
        Parser.parser(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_2PlusNum_NumberFormatExceptionReturned() {
        String[] args = {"2", "+", "Num"};
        Parser.parser(args);
    }
    @Test(expected = ArithmeticException.class)
    public void parser_6Divide0_ArithmeticExceptionReturned() {
        String[] args = {"100", "/", "0"};
        Parser.parser(args);
    }

    @Test
    public void parser_PlusMinusMultiplyDivide_TrueReturned(){
        String[] args1 = {"4", "+", "2"};
        String[] args2 = {"4", "-", "2"};
        String[] args3 = {"4", "*", "2"};
        String[] args4 = {"4", "/", "2"};
        if (Parser.parser(args1) && Parser.parser(args2) && Parser.parser(args3) && Parser.parser(args4)){
            Assert.assertTrue(true);
        }

    }
}
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    @Test
    public void parser_8Returned() {
        Assert.assertEquals(Parser.parser(8), "Result is: 8");
    }
}
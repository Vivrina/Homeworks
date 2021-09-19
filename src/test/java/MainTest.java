import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void output(){
        String[] args = {"4", "+", "2"};
        Assert.assertTrue(Main.main(args));

    }
}

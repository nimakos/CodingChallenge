import euler.Euler1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCodingChallenge {

    @Test
    public static void multiply3And5(){
        Assert.assertEquals(Euler1.multiply3And5(), 233168);
    }
}

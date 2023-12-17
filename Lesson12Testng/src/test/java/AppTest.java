import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testCalculateFactorialForZero(){
        long result = App.calculateFactorial(0);
        Assert.assertEquals(result,1,
                String.format("Verifi " + result));
    }

    @Test
    public void testCalculateFactorialForOne(){
        long result = App.calculateFactorial(1);
        Assert.assertEquals(result,1,
                String.format("Verifi " + result));
    }

    @Test
    public void testCalculateFactorialForPositiveNumber(){
        long result = App.calculateFactorial(5);
        Assert.assertEquals(result,120,
                String.format("Verifi " + result));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialForNegativeNumber(){
        App.calculateFactorial(-5);
    }
}

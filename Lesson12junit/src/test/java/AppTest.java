import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalculateFactorialForZero() {
        long result = App.calculateFactorial(0);
        Assertions.assertEquals(result, 1,
                String.format("Verifi " + result));
    }

    @Test
    public void testCalculateFactorialForOne() {
        long result = App.calculateFactorial(1);
        Assertions.assertEquals(result, 1,
                String.format("Verifi " + result));
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        long result = App.calculateFactorial(5);
        Assertions.assertEquals(result, 120,
                String.format("Verifi " + result));
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                            App.calculateFactorial(-5);
                        }
                );
        Assertions.assertEquals("Число не может быть отрицательным", thrown.getMessage());
    }

}

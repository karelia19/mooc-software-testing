package tudelft.gettingstarted;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo30() {
        int result = new GettingStarted().addFive(30);
        Assertions.assertEquals(35,result);
    }

    @Test
    public void	addFiveToZero() {
        int	result = new GettingStarted().addFive(0);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void addFiveToMinus30() {
        int result = new GettingStarted().addFive(-30);
        Assertions.assertEquals(-25,result);
    }
}

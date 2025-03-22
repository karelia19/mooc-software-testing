package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void totalIsExactlyMetWithAvailableBars() {
        int result = new ChocolateBags().calculate(6, 2, 16);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void customCriterionTest() {
        int result = new ChocolateBags().calculate(7, 3, 19);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void notEnoughBarsToMeetTotal() {
        int result = new ChocolateBags().calculate(2, 1, 8);
        Assertions.assertEquals(-1, result);
    }
}

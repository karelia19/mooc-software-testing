package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {
//@Test
//public void bothPlayersGoTooHigh() {
//    int result = new BlackJack().play(30, 30);
//    Assertions.assertEquals(0, result);
//}


    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void rightPlayerTooHighLeftWins() {
        int result = new BlackJack().play(18, 22);
        Assertions.assertEquals(18, result);
    }

    @Test
    public void leftPlayerTooHighRightWins() {
        int result = new BlackJack().play(25, 19);
        Assertions.assertEquals(19, result);
    }

    @Test
    public void bothEqualNoOneTooHigh() {
        int result = new BlackJack().play(17, 17);
        Assertions.assertEquals(17, result);
    }
}

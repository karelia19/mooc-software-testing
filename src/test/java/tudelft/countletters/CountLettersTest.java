package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    //Nuevos casos de test
    @Test
    public void lastWordEndsInX() {
        int words = new CountLetters().count("box");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void noWordsShouldMatch() {
        int words = new CountLetters().count("abc|def"); // termina en 'f'
        Assertions.assertEquals(0, words);
    }

    @Test
    public void endsInRBeforeSeparator() {
        int words = new CountLetters().count("car|");
        Assertions.assertEquals(1, words); // cuenta por 'r'
    }

    @Test
    public void endsInTBeforeSeparator() {
        int words = new CountLetters().count("cat|");
        Assertions.assertEquals(0, words); // 't' no activa conteo
    }

    @Test
    public void endsWithX() {
        int words = new CountLetters().count("box");
        Assertions.assertEquals(1, words); // 'x' cuenta al final
    }

    @Test
    public void endsWithGNoMatch() {
        int words = new CountLetters().count("dog");
        Assertions.assertEquals(0, words);
    }

}
package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @Test
    public void testGGEnMedio() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("xxggxx")); // verdadero
    }

    @Test
    public void testGUnica() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xxgxx")); // falso
    }


    @Test
    public void testSoloGsFelices() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("gggg")); // verdadero
    }

    @Test
    public void testCadenaVacia() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("")); // verdadero
    }

    @Test
    public void testGAlInicioYAlFinal() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("gxxg")); // falso
    }
}


package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testCifradoSimple() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.caesarShiftCipher("abc", 3));
    }

    @Test
    public void testCifradoConEspacios() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("d f", cipher.caesarShiftCipher("a c", 3));
    }

    @Test
    public void testCifradoConDesplazamientoNegativo() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.caesarShiftCipher("abc", -3));
    }

    @Test
    public void testCifradoConCaracteresInválidos() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.caesarShiftCipher("abc123", 3));
    }

    @Test
    public void testCadenaVacia() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("", cipher.caesarShiftCipher("", 3));
    }

    @Test
    public void testSinDesplazamiento() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.caesarShiftCipher("abc", 0));
    }
}

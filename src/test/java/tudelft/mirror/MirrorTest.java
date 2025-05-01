package tudelft.mirror;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorEnds_abXYZba() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testMirrorEnds_abca() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    public void testMirrorEnds_aba() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testMirrorEnds_empty() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testMirrorEnds_singleChar() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("a"));
    }

    @Test
    public void testMirrorEnds_noMirror() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("abcdef"));
    }

    @Test
    public void testMirrorEnds_fullMirrorEvenLength() {
        Mirror mirror = new Mirror();
        assertEquals("abccba", mirror.mirrorEnds("abccba"));
    }

    @Test
    public void testMirrorEnds_fullMirrorOddLength() {
        Mirror mirror = new Mirror();
        assertEquals("racecar", mirror.mirrorEnds("racecar"));
    }
}
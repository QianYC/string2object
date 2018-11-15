import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CharReaderTest {

    @Test
    public void read() throws IOException {
        CharReader charReader = new CharReader("t");
        assertEquals('t', charReader.read());
        assertEquals('t', charReader.read());
    }

    @Test
    public void read1() throws IOException {
        CharReader charReader = new CharReader("null");
        assertEquals("null", charReader.read(4));
//        assertEquals('t', charReader.read());
    }

    @Test
    public void peek() {
        CharReader charReader = new CharReader("");
        assertEquals(-1, charReader.peek());
    }

    @Test
    public void peek1() {
        CharReader charReader = new CharReader("null");
        assertEquals("null", charReader.peek(7));
    }
}
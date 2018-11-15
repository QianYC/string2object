import java.io.IOException;

/**
 * @ClassName: CharReader
 * @Description: TODO
 * @Author: ycqian
 * @Date: 2018/11/13
 * @Version: 0.0.1
 */
public class CharReader {

    private int pos = 0, size = 0;
    private char[] buff;

    public CharReader(String s) {
        assert s != null;
        buff = s.toCharArray();
        size = buff.length;
    }

    public boolean hasMore() {
        return pos < size;
    }

    public char read() throws IOException {
        if (pos >= size) {
            throw new IOException();
        }
        char c = buff[pos];
        pos++;
        return c;
    }

    public String read(int n) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(read());
        }
        return stringBuilder.toString();
    }

    public int peek() {
        return pos < size ? buff[pos] : -1;
    }

    public String peek(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n && i + pos < size; i++) {
            stringBuilder.append(buff[i]);
        }
        return stringBuilder.toString();
    }

    public void reset() {
        pos = 0;
    }

    public void unread() {
        pos--;
        pos = pos < 0 ? 0 : pos;
    }

    public void unread(int n) {
        pos -= n;
        pos = pos < 0 ? 0 : pos;
    }

    public int getPos() {
        return pos;
    }
}

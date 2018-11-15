import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TokenReader
 * @Description: TODO
 * @Author: ycqian
 * @Date: 2018/11/13
 * @Version: 0.0.1
 */
public class TokenReader {
    private List<Token> tokens;
    private int pos = 0;

    public TokenReader() {
        tokens = new ArrayList<Token>();
    }

    public void add(Token token) {
        tokens.add(token);
    }

    public Token read() {
        return pos < tokens.size() ? tokens.get(pos++) : null;
    }

    public void unread() {
        pos--;
        pos = pos < 0 ? 0 : pos;
    }

    public int getPos() {
        return pos;
    }

    public String toString() {
        return tokens.toString();
    }
}

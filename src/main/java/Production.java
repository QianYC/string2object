/**
 * @ClassName: Production
 * @Description: TODO
 * @Author: ycqian
 * @Date: 2018/11/15
 * @Version: 0.0.1
 */
public class Production {
    private Token left;
    private String production;
    private int length;

    private static final Production[] list = {
            new Production(new Token(Token.S_, "S'"), "S' -> S", 1),
            new Production(new Token(Token.S, "S"), "S -> obj", 1),
            new Production(new Token(Token.S, "S"), "S -> arr", 1),
            new Production(new Token(Token.OBJ, "obj"), "obj -> {}", 2),
            new Production(new Token(Token.OBJ, "obj"), "obj -> {A}", 3),
            new Production(new Token(Token.A, "A"), "A -> string : val", 3),
            new Production(new Token(Token.A, "A"), "A -> A , string : val", 5),
            new Production(new Token(Token.ARR, "arr"), "arr -> []", 2),
            new Production(new Token(Token.ARR, "arr"), "arr -> [B]", 3),
            new Production(new Token(Token.B, "B"), "B -> val", 1),
            new Production(new Token(Token.B, "B"), "B -> B , val", 3),
            new Production(new Token(Token.VAL, "val"), "val -> string", 1),
            new Production(new Token(Token.VAL, "val"), "val -> num", 1),
            new Production(new Token(Token.VAL, "val"), "val -> obj", 1),
            new Production(new Token(Token.VAL, "val"), "val -> arr", 1),
            new Production(new Token(Token.VAL, "val"), "val -> bool", 1),
            new Production(new Token(Token.VAL, "val"), "val -> null", 1)
    };

    private Production(Token token, String s, int len) {
        left = token;
        production = s;
        length = len;
    }

    public static Production getInstance(int i) {
        assert i < list.length;
        return list[i];
    }

    public int getLength() {
        return length;
    }

    public Token getLeft() {
        return left;
    }

    public String toString() {
        return production;
    }
}

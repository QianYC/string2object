import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName: String2Object
 * @Description: 此类的功能是把String转化为相应的对象
 * @Author: ycqian
 * @Date: 2018/11/9
 * @Version: 0.0.1
 */
public class String2Object implements StringParser {

    public Object parse(String json, Class jclass) throws ParseException {
        return null;
    }

    public Object parse(String json) {
        return null;
    }

    private static final HashMap<Integer, HashMap<Integer, Operation>> ppt =
            new HashMap<Integer, HashMap<Integer, Operation>>(){{
                put(0, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(4));
                    put(2, Operation.getShiftOp(5));
                    put(11, Operation.getGotoOp(1));
                    put(15, Operation.getGotoOp(2));
                    put(16, Operation.getGotoOp(3));
                }});
                put(1,new HashMap<Integer, Operation>(){{
                    put(10, Operation.getReduceOp(0));
                }});
                put(2,new HashMap<Integer, Operation>(){{
                    put(10, Operation.getReduceOp(1));
                }});
                put(3,new HashMap<Integer, Operation>(){{
                    put(10, Operation.getReduceOp(2));
                }});
                put(4, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(6));
                    put(4, Operation.getShiftOp(8));
                    put(12, Operation.getGotoOp(7));
                }});
                put(5, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(18));
                    put(2, Operation.getShiftOp(19));
                    put(3, Operation.getShiftOp(9));
                    put(4, Operation.getShiftOp(12));
                    put(7, Operation.getShiftOp(13));
                    put(8, Operation.getShiftOp(16));
                    put(9, Operation.getShiftOp(17));
                    put(13, Operation.getGotoOp(10));
                    put(14, Operation.getGotoOp(11));
                    put(15, Operation.getGotoOp(14));
                    put(16, Operation.getGotoOp(15));
                }});
                put(6, new HashMap<Integer, Operation>() {{
                    put(10, Operation.getReduceOp(3));
                }});
                put(7, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(20));
                    put(5, Operation.getShiftOp(21));
                }});
                put(8, new HashMap<Integer, Operation>() {{
                    put(6, Operation.getShiftOp(22));
                }});
                put(9, new HashMap<Integer, Operation>() {{
                    put(10, Operation.getReduceOp(7));
                }});
                put(10, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getShiftOp(23));
                    put(5, Operation.getShiftOp(24));
                }});
                put(11, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(9));
                    put(5, Operation.getReduceOp(9));
                }});
                put(12, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(11));
                    put(5, Operation.getReduceOp(11));
                }});
                put(13, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(12));
                    put(5, Operation.getReduceOp(12));
                }});
                put(14, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(13));
                    put(5, Operation.getReduceOp(13));
                }});
                put(15, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(14));
                    put(5, Operation.getReduceOp(14));
                }});
                put(16, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(15));
                    put(5, Operation.getReduceOp(15));
                }});
                put(17, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(16));
                    put(5, Operation.getReduceOp(16));
                }});
                put(18, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(25));
                    put(4, Operation.getShiftOp(8));
                    put(12, Operation.getGotoOp(26));
                }});
                put(19, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(18));
                    put(2, Operation.getShiftOp(19));
                    put(3, Operation.getShiftOp(27));
                    put(4, Operation.getShiftOp(12));
                    put(7, Operation.getShiftOp(13));
                    put(8, Operation.getShiftOp(16));
                    put(9, Operation.getShiftOp(17));
                    put(13, Operation.getGotoOp(28));
                    put(14, Operation.getGotoOp(11));
                    put(15, Operation.getGotoOp(14));
                    put(16, Operation.getGotoOp(15));
                }});
                put(20, new HashMap<Integer, Operation>() {{
                    put(10, Operation.getReduceOp(4));
                }});
                put(21, new HashMap<Integer, Operation>() {{
                    put(4, Operation.getShiftOp(47));
                }});
                put(22, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(36));
                    put(2, Operation.getShiftOp(37));
                    put(4, Operation.getShiftOp(30));
                    put(7, Operation.getShiftOp(31));
                    put(8, Operation.getShiftOp(34));
                    put(9, Operation.getShiftOp(35));
                    put(14, Operation.getGotoOp(29));
                    put(15, Operation.getGotoOp(32));
                    put(16, Operation.getGotoOp(33));
                }});
                put(23, new HashMap<Integer, Operation>() {{
                    put(10, Operation.getReduceOp(8));
                }});
                put(24, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(18));
                    put(2, Operation.getShiftOp(19));
                    put(4, Operation.getShiftOp(12));
                    put(7, Operation.getShiftOp(13));
                    put(8, Operation.getShiftOp(16));
                    put(9, Operation.getShiftOp(17));
                    put(14, Operation.getGotoOp(38));
                    put(15, Operation.getGotoOp(14));
                    put(16, Operation.getGotoOp(15));
                }});
                put(25, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(3));
                    put(5, Operation.getReduceOp(3));
                }});
                put(26, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(39));
                    put(5, Operation.getShiftOp(21));
                }});
                put(27, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(7));
                    put(5, Operation.getReduceOp(7));
                }});
                put(28, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getShiftOp(40));
                    put(5, Operation.getShiftOp(24));
                }});
                put(29, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(5));
                    put(5, Operation.getReduceOp(5));
                }});
                put(30, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(11));
                    put(5, Operation.getReduceOp(11));
                }});
                put(31, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(12));
                    put(5, Operation.getReduceOp(12));
                }});
                put(32, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(13));
                    put(5, Operation.getReduceOp(13));
                }});
                put(33, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(14));
                    put(5, Operation.getReduceOp(14));
                }});
                put(34, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(15));
                    put(5, Operation.getReduceOp(15));
                }});
                put(35, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(16));
                    put(5, Operation.getReduceOp(16));
                }});
                put(36, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(41));
                    put(4, Operation.getShiftOp(8));
                    put(12, Operation.getGotoOp(42));
                }});
                put(37, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(18));
                    put(2, Operation.getShiftOp(19));
                    put(3, Operation.getShiftOp(43));
                    put(4, Operation.getShiftOp(12));
                    put(7, Operation.getShiftOp(13));
                    put(8, Operation.getShiftOp(16));
                    put(9, Operation.getShiftOp(17));
                    put(13, Operation.getGotoOp(44));
                    put(14, Operation.getGotoOp(11));
                    put(15, Operation.getGotoOp(14));
                    put(16, Operation.getGotoOp(15));
                }});
                put(38, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(10));
                    put(5, Operation.getReduceOp(10));
                }});
                put(39, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(4));
                    put(5, Operation.getReduceOp(4));
                }});
                put(40, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getReduceOp(8));
                    put(5, Operation.getReduceOp(8));
                }});
                put(41, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(3));
                    put(5, Operation.getReduceOp(3));
                }});
                put(42, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getShiftOp(45));
                    put(5, Operation.getShiftOp(21));
                }});
                put(43, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(7));
                    put(5, Operation.getReduceOp(7));
                }});
                put(44, new HashMap<Integer, Operation>() {{
                    put(3, Operation.getShiftOp(46));
                    put(5, Operation.getShiftOp(24));
                }});
                put(45, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(4));
                    put(5, Operation.getReduceOp(4));
                }});
                put(46, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(8));
                    put(5, Operation.getReduceOp(8));
                }});
                put(47, new HashMap<Integer, Operation>() {{
                    put(6, Operation.getShiftOp(48));
                }});
                put(48, new HashMap<Integer, Operation>() {{
                    put(0, Operation.getShiftOp(36));
                    put(2, Operation.getShiftOp(37));
                    put(4, Operation.getShiftOp(30));
                    put(7, Operation.getShiftOp(31));
                    put(8, Operation.getShiftOp(34));
                    put(9, Operation.getShiftOp(35));
                    put(14, Operation.getGotoOp(49));
                    put(15, Operation.getGotoOp(32));
                    put(16, Operation.getGotoOp(33));
                }});
                put(49, new HashMap<Integer, Operation>() {{
                    put(1, Operation.getReduceOp(6));
                    put(5, Operation.getReduceOp(6));
                }});
    }};

    public void parse(TokenReader reader) throws ParseException {
        Stack<Integer> states = new Stack<Integer>();
        Stack<Token> tokens = new Stack<Token>();

        int state=0;
        states.push(state);
        tokens.push(new Token(Token.$R, "EOF"));
        while (true) {
            Token token = reader.read();
            if (token == null) {
                break;
            }
            Operation operation = ppt.get(state).get(token.getType());
            if (operation == null) {
                throw new ParseException("Unexpected token : " + token + " at : " + reader.getPos());
            } else if (operation.getType() == Operation.SHIFT) {
                state = operation.getVal();
                states.push(state);
                tokens.push(token);
            } else if (operation.getType() == Operation.REDUCE) {
                int productionId = operation.getVal();
                Production production = Production.getInstance(productionId);
                if (productionId == 0) {
                    //success
                    System.out.println(production);
                    break;
                }
                for (int i = 0; i < production.getLength(); i++) {
                    states.pop();
                    tokens.pop();
                }
                Token vn = production.getLeft();
                tokens.push(vn);
                state = states.peek();
                System.out.println(production);

                //goto
                operation = ppt.get(state).get(vn.getType());
                if (operation == null||operation.getType()!=Operation.GOTO) {
                    throw new ParseException("Unexpected reduction : " + production);
                }
                state = operation.getVal();
                states.push(state);
                reader.unread();
            }

        }

    }

    public TokenReader tokenize(String json) throws ParseException {
        CharReader reader = new CharReader(json);
        TokenReader tokenReader = new TokenReader();
        Token token = null;
        do {
            token = read(reader);
            tokenReader.add(token);
        } while (token.getType() != Token.$R);
        
        return tokenReader;
    }

    private Token read(CharReader reader) throws ParseException {
        char c;
        Token token = null;
        try {
            do {
                c = reader.read();
            } while (isWS(c));

            switch (c) {
                case '"':
                    token = readString(reader);
                    break;
                case 'n':
                    token = readNull(reader);
                    break;
                case 't':
                    token = readTrue(reader);
                    break;
                case 'f':
                    token = readFalse(reader);
                    break;
                case '[':
                    token = new Token(Token.ARR_START, "[");
                    break;
                case ']':
                    token = new Token(Token.ARR_END, "]");
                    break;
                case '{':
                    token = new Token(Token.OBJ_START, "{");
                    break;
                case '}':
                    token = new Token(Token.OBJ_END, "}");
                    break;
                case ':':
                    token = new Token(Token.COLON, ":");
                    break;
                case ',':
                    token = new Token(Token.COMMA, ",");
                    break;
                default:
                    if (c >= '0' && c <= '9' || c == '-' || c == '+') {
                        reader.unread();
                        token = readNum(reader);
                    } else {
                        throw new ParseException("invalid character at : " + (reader.getPos() - 1));
                    }
            }
        } catch (IOException e) {
            token = new Token(Token.$R, "EOF");
        } catch (ParseException e) {
            throw e;
        }
        return token;
    }

    private boolean isWS(char c) {
        return c == '\n' || c == '\r' || c == ' ' || c == '\t';
    }

    private Token readNull(CharReader reader) throws ParseException {
        String res = null;
        try {
            res = reader.read(3);
        } catch (IOException e) {
        }
        if ("ull".equals(res)) {
            return new Token(Token.NULL, "null");
        } else throw new ParseException("invalid character at : " + (reader.getPos() - 1));
    }

    private Token readTrue(CharReader reader) throws ParseException {
        String res = null;
        try {
            res = reader.read(3);
        } catch (IOException e) {
        }
        if ("rue".equals(res)) {
            return new Token(Token.BOOL, "true");
        } else throw new ParseException("invalid character at : " + (reader.getPos() - 1));
    }

    private Token readFalse(CharReader reader) throws ParseException {
        String res = null;
        try {
            res = reader.read(4);
        } catch (IOException e) {
        }
        if ("alse".equals(res)) {
            return new Token(Token.BOOL, "false");
        } else throw new ParseException("invalid character at : " + (reader.getPos() - 1));
    }

    private static final int READ_INT_PART = 0;
    private static final int READ_FRA_PART = 1;
    private static final int READ_EXP_PART = 2;
    private static final int READ_NUM_END = 3;

    private Token readNum(CharReader reader) throws ParseException {
        StringBuilder intPart = new StringBuilder();
        StringBuilder fraPart = new StringBuilder();
        StringBuilder expPart = new StringBuilder();

        char sign = 0;
        char expsign = 0;
        char c = (char) reader.peek();
        if (c == '-') {
            try {
                reader.read();
            } catch (IOException e) {
            }
            sign = c;
        }
        int state = READ_INT_PART;
        while (true) {
            if (reader.hasMore()) {
                c = (char) reader.peek();
            } else state = READ_NUM_END;
            try {
                switch (state) {
                    case READ_INT_PART:
                        if (c >= '0' && c <= '9') {
                            intPart.append(reader.read());
                        } else if (c == '.') {
                            if (intPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            reader.read();
                            state = READ_FRA_PART;
                        } else if (c == 'e' || c == 'E') {
                            if (intPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            reader.read();
                            state = READ_EXP_PART;
                        } else {
                            if (intPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            state = READ_NUM_END;
                        }
                        break;
                    case READ_FRA_PART:
                        if (c >= '0' && c <= '9') {
                            fraPart.append(reader.read());
                        } else if (c == 'e' || c == 'E') {
                            if (fraPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            reader.read();
                            state = READ_EXP_PART;
                        } else {
                            if (fraPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            state = READ_NUM_END;
                        }
                        break;
                    case READ_EXP_PART:
                        if (c == '-' || c == '+') {
                            if (expsign == 0) {
                                expsign = reader.read();
                            } else throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                        } else if (c >= '0' && c <= '9') {
                            expPart.append(reader.read());
                        } else {
                            if (expPart.toString().length() == 0) {
                                throw new ParseException("Unexpected char " + c + " at : " + reader.getPos());
                            }
                            state = READ_NUM_END;
                        }
                        break;
                    case READ_NUM_END:
                        if (intPart.toString().length() == 0) {
                            throw new ParseException("Integer part missing at : " + reader.getPos());
                        }
                        String num = sign + intPart.toString();
                        if (fraPart.toString().length() > 0) {
                            num += ("." + fraPart.toString());
                        }
                        if (expPart.toString().length() > 0) {
                            num += ("e" + expsign + expPart.toString());
                        }
                        return new Token(Token.NUM, num);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Token readString(CharReader reader) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            while (true) {
                char c = reader.read();
                stringBuilder.append(c);
                if (c == '"') {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("invalid string");
            throw new ParseException("invalid character at : " + (reader.getPos() - 1));
        }
        return new Token(Token.STRING, stringBuilder.toString());
    }

}

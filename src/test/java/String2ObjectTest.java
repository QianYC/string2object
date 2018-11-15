import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String2ObjectTest {

    @Test
    public void tokenize() throws ParseException {
        String2Object object = new String2Object();
        TokenReader reader = object.tokenize("{\"n\":1e+4}");
        System.out.println(reader);
    }

    @Test
    public void parse() throws ParseException {
        String2Object object = new String2Object();
        TokenReader reader = object.tokenize("{\"a\":1,\"b\":[null,{}]}");
        System.out.println(reader);
        object.parse(reader);
    }
    
}                                        
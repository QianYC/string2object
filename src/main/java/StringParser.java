/**
 * @ClassName: StringParser
 * @Description: TODO
 * @Author: 17678
 * @Date: 2018/11/9
 * @Version: 0.0.1
 */
public interface StringParser {

    /**
     * parse string according to the parameter string and the class definition
     * @param json
     * @param jclass
     * @return
     * @throws ParseException
     */
    Object parse(String json, Class jclass) throws ParseException;

    /**
     * parse string by auto-detection, only recognize java builtin types
     * @param json
     * @return
     */
    Object parse(String json);
}

import lombok.NoArgsConstructor;

/**
 * @ClassName: ParseException
 * @Description: TODO
 * @Author: 17678
 * @Date: 2018/11/9
 * @Version: 0.0.1
 */
@NoArgsConstructor
public class ParseException extends Exception {
    public ParseException(String msg) {
        super(msg);
    }
}

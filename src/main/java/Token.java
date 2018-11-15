import com.sun.org.apache.xerces.internal.util.SymbolTable;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Token
 * @Description: TODO
 * @Author: ycqian
 * @Date: 2018/11/13
 * @Version: 0.0.1
 */
@Getter
@Setter
public class Token {
        public static final int STRING=4,NUM=7,NULL=9,BOOL=8,OBJ_START=0,OBJ_END=1
                ,ARR_START=2,ARR_END=3,COLON=6,COMMA=5, $R = 10
                ,S=11,A=12,B=13,VAL=14,OBJ=15,ARR=16,S_=17;

        private int type;
        private String value;

        public Token(int type, String value) {
                this.type = type;
                this.value = value;
        }

        public String toString() {
                return "< type : " + type + " , value : " + value + " >";
        }
}

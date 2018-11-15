/**
 * @ClassName: Operation
 * @Description: TODO
 * @Author: ycqian
 * @Date: 2018/11/15
 * @Version: 0.0.1
 */
public class Operation {
    public static final int SHIFT=0,REDUCE=1, GOTO = 2;

    private int type, val;

    private Operation(int type, int val) {
        this.type = type;
        this.val = val;
    }

    public static Operation getShiftOp(int val) {
        return new Operation(SHIFT, val);
    }

    public static Operation getReduceOp(int val) {
        return new Operation(REDUCE, val);
    }

    public static Operation getGotoOp(int val) {
        return new Operation(GOTO, val);
    }

    public int getType() {
        return type;
    }

    public int getVal() {
        return val;
    }
}

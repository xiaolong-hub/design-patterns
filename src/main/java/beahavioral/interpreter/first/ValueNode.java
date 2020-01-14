package beahavioral.interpreter.first;

/**
 * 终结符表达式,实现了抽象类Node中的解释方法(interpret)此处已经是最小单位不能再包含子表达式
 */
public class ValueNode implements Node {

    private int value;
    public ValueNode(int value) {
        this.value = value;
    }

    public int interpret() {
       return this.value;
    }
}

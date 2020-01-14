package beahavioral.interpreter.first;

/**
 * 乘法节点类 用于返回左右表达式的乘积
 */
public class MulNode extends SymbolNode{
    public int interpret() {
        return super.left.interpret()*super.right.interpret();
    }

    public MulNode(Node left, Node right) {
        super(left, right);
    }
}

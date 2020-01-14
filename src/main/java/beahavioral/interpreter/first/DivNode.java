package beahavioral.interpreter.first;

/**
 * 除法节点
 */
public class DivNode extends SymbolNode {


    public DivNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return super.left.interpret()/super.right.interpret();
    }
}

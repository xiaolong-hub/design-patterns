package beahavioral.interpreter.second;

/**
 * 乘法
 */
public class Mul extends SymbolNodeTwo {
    public int interpretTwo() {
        return super.left.interpretTwo()/super.right.interpretTwo();
    }

    public Mul(Node left, Node right) {
        super(left, right);
    }
}

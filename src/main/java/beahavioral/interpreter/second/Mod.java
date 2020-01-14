package beahavioral.interpreter.second;

/**
 * 求余数
 */
public class Mod extends SymbolNodeTwo {
    public int interpretTwo() {
        return super.left.interpretTwo()%super.right.interpretTwo();
    }

    public Mod(Node left, Node right) {
        super(left, right);
    }
}

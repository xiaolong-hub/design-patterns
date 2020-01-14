package beahavioral.interpreter.second;

/**
 * 除法
 */
public class Div extends SymbolNodeTwo {
    public int interpretTwo() {
        return super.left.interpretTwo()/super.right.interpretTwo();
    }

    public Div(Node left, Node right) {
        super(left, right);
    }
}

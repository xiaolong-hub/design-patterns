package beahavioral.interpreter.second;

public abstract class SymbolNodeTwo implements Node {
    protected Node left;
    protected Node right;

    public SymbolNodeTwo(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}

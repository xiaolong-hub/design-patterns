package beahavioral.interpreter.PK;

public abstract class SymbolNodePK implements NodePK{
    private String left;
    private String right;

    public SymbolNodePK(String left, String right) {
        this.left = left;
        this.right = right;
    }
}

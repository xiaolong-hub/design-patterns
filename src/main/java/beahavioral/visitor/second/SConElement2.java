package beahavioral.visitor.second;

public class SConElement2 extends SElement {
    @Override
    public void accept(SVisitor sVisitor) {
        sVisitor.VisitSConEloemen2(this);
        Operator2();
    }
    public void Operator2() {
        System.out.println("SConElement2特有的方法Operator2");
    }
}

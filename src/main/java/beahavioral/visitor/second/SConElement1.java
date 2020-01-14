package beahavioral.visitor.second;

public class SConElement1 extends SElement {
    @Override
    public void accept(SVisitor sVisitor) {
        sVisitor.VisitSConElement1(this);
        Operator1();
    }
    public void Operator1() {
        System.out.println("SElement1特有的方法Operator1");
    }
}


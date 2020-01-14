package beahavioral.visitor.first;

public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
        OperatorB();
    }
    public void OperatorB() {
        System.out.println("B特有的方法");
    }
}

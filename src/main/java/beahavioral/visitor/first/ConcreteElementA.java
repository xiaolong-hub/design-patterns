package beahavioral.visitor.first;

public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
        OperatorA();
    }
    public void OperatorA() {
        System.out.println("A特有的方法OperatorA");

    }
}

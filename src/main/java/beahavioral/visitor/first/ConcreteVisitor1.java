package beahavioral.visitor.first;

public class ConcreteVisitor1 extends Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("访问者:"+this.getClass().getSimpleName()+"-------"+"被访问对象:"+concreteElementA.getClass().getSimpleName());
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("访问者:"+this.getClass().getSimpleName()+"-------"+"被访问对象:"+concreteElementB.getClass().getSimpleName());
    }
}

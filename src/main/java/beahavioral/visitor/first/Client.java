package beahavioral.visitor.first;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitor=new ConcreteVisitor1();
        Visitor visitor1=new ConcreteVisitor2();

        objectStructure.accept(visitor);
        objectStructure.accept(visitor1);
    }
}

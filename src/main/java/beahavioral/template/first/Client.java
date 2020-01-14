package beahavioral.template.first;

public class Client {
    public static void main(String[] args) {
        AbstractClass a=new ConcreteClassA();
        a.TemlateMethod();

        AbstractClass b = new ConcreteClassB();
        b.TemlateMethod();
    }
}

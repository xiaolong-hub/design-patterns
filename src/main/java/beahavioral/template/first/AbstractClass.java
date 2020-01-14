package beahavioral.template.first;

public abstract class AbstractClass {
    public abstract void PrimitiveOperation();

    public abstract void PrimitiveOperation2();

    public void TemlateMethod() {
        PrimitiveOperation();
        PrimitiveOperation2();
        System.out.println("抽象类模板方法");
    }
}

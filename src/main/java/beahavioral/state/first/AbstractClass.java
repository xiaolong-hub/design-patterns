package beahavioral.state.first;

public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();

    /**
     *  定义一个算法骨架,实现某些功能的固定步骤,具体的实现由子类重写方法时具体实现.
     */
    public void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("抽象类模板方法");
    }
}

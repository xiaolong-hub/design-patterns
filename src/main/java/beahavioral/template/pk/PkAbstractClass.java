package beahavioral.template.pk;

public abstract class PkAbstractClass {
    public abstract void POperation1();

    public abstract void POperation2();

    public void template() {
        POperation1();
        POperation2();
        System.out.println("抽象的步骤");
    }
}

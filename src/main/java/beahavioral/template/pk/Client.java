package beahavioral.template.pk;

public class Client {
    public static void main(String[] args) {
        PkAbstractClass pkAbstractClass = new PKConClassA();
        PkAbstractClass pkAbstractClass1 = new PkConClassB();
        pkAbstractClass.template();
        pkAbstractClass1.template();
    }
}

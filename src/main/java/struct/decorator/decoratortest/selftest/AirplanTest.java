package struct.decorator.decoratortest.selftest;

public class AirplanTest extends ChangerTest {
    public AirplanTest(TransforTest transforTest) {
        super(transforTest);
    }

    public  void fly() {
        System.out.println("MD 打不过威震天,三十六计走为上计");
    }
}

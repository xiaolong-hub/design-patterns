package struct.decorator.decoratortest.selftest;

public class CarTest implements TransforTest {
    public void move() {
        System.out.println("在地上跑");
    }

    public CarTest() {
        System.out.println("变形金刚是一辆汽车");
    }
}

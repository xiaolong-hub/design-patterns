package struct.decorator;

public final class Car implements Transform {
    public void move() {
        System.out.println("我是擎天柱现在时速500Km");
    }

    public Car() {
        System.out.println("我擎天柱本质是一辆汽车");
    }
}

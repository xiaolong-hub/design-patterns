package struct.decorator;

public class Robot extends Changer {


    public Robot(Transform transform) {
        super(transform);
        System.out.println("我是擎天柱汽车形态扛不住了现在变成机器人与你战斗");
    }

    public void say() {
        System.out.println("威震天我要跟你决一死战!");

    }


}

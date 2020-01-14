package struct.decorator.decoratortest;

public class Airplan extends Changer{
    public Airplan(Transfrom transfrom) {
        super(transfrom);
    }

    public void fly() {
        System.out.println("我能飞");
    }
}

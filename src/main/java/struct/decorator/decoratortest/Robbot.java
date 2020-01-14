package struct.decorator.decoratortest;

public class Robbot extends Changer {
    public Robbot(Transfrom transfrom) {
        super(transfrom);
    }

    public void say() {
        System.out.println("我能说话");
    }

}

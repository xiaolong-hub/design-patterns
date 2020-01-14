package struct.decorator;

public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机");
    }


    public void fly() {
        System.out.println("MD打不过威震天,三十六计走为上计,下次再打,回见了您勒");
    }


}

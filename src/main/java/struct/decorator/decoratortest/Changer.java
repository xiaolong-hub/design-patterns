package struct.decorator.decoratortest;

public class Changer implements Transfrom {
    Transfrom transfrom;

    public Changer(Transfrom transfrom) {
        this.transfrom = transfrom;
    }

    public void move() {
        transfrom.move();
    }
}

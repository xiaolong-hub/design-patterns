package struct.decorator;

public class Client {
    public static void main(String[] args) {
        Transform qingtainzhu ;
        qingtainzhu=new Car();
        qingtainzhu.move();

        Robot bumblebee = new Robot(qingtainzhu);
        bumblebee.move();
        bumblebee.say();

        Airplane bumblebee2 = new Airplane(qingtainzhu);
        bumblebee2.move();
        bumblebee2.fly();
    }
}

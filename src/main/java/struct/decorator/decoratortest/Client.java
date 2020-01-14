package struct.decorator.decoratortest;

public class Client {
    public static void main(String[] args) {
        Transfrom transfrom;
        transfrom =new Car();
        transfrom.move();

        Robbot bee = new Robbot(transfrom);
        bee.move();
        bee.say();

    }
}

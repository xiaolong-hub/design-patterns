package struct.decorator.decoratortest.selftest;

public class Client {
    public static void main(String[] args) {
        TransforTest transforTest;
        CarTest carTest;
        RobotTest robotTest;
        AirplanTest airplanTest;

        carTest=new CarTest();
        carTest.move();
        System.out.println("=============");

        /*开始给car装饰新的功能fly*/
        AirplanTest airplanTest1 = new AirplanTest(carTest);
        airplanTest1.fly();

    }
}

package beahavioral.command.test;

public class Client {
    public static void main(String[] args) {
        AbstractCommandTest obj1,obj2,obj3;
        obj1=new TVCloseTest();
        obj2=new TVChangeTest();
        obj3=new TVOpenTest();

        ControllerTest controllerTest = new ControllerTest(obj1, obj2, obj3);
        obj1.excute();
        obj2.excute();
        obj3.excute();
    }
}

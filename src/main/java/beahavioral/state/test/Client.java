package beahavioral.state.test;

public class Client {
    public static void main(String[] args) {


        ContextTest contextTest = new ContextTest(new SleepState());


        contextTest.request();

        contextTest.request();
        contextTest.request();
    }
}

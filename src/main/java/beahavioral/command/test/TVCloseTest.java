package beahavioral.command.test;

public class TVCloseTest implements AbstractCommandTest{
    private TVTest tv;

    public void excute() {
        tv.close();
    }

    public TVCloseTest( ) {
        tv=new TVTest();
    }
}

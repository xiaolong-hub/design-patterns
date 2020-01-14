package beahavioral.command.test;

public class TVChangeTest implements AbstractCommandTest{
    private TVTest tv;

    public TVChangeTest( ) {
        tv=new TVTest();
    }

    public void excute() {
        tv.change();
    }
}

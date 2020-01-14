package struct.decorator.decoratortest.selftest;

public class ChangerTest implements TransforTest {
    private TransforTest transforTest;

    public ChangerTest(TransforTest transforTest) {
        this.transforTest = transforTest;
    }

    public void move() {
        transforTest.move();
    }
}

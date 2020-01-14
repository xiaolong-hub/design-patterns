package struct.facade.facadetest;

public class LightsTest {
    private String location;

    public LightsTest(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location+"灯打开");

    }
    public void off() {
        System.out.println(this.location+"灯关掉");
    }
}

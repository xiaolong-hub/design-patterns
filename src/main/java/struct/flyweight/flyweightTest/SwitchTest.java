package struct.flyweight.flyweightTest;

public class SwitchTest implements NetworkDeviceTest {
    private String type;

    public SwitchTest(String type) {
        this.type = type;

    }

    public String getType() {
        return this.type;
    }

    public void use() {
        System.out.println("调用的协议是"+this.type);
    }

}

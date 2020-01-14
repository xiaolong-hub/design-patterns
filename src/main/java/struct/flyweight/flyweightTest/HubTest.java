package struct.flyweight.flyweightTest;

public class HubTest implements NetworkDeviceTest{
    private String type;

    public String getType() {
        return this.type;

    }

    public void use() {
        System.out.println("调用的协议是"+this.type);
    }

    public HubTest(String type) {
        this.type=type;
    }

}

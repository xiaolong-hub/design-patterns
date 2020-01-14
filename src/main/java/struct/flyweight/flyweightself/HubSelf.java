package struct.flyweight.flyweightself;

public class HubSelf implements NetWorkDeviceSelf {
    private String type;

    public String getType() {
        return this.type;
    }

    public HubSelf(String type) {
        this.type = type;
    }

    public void use() {
        System.out.println("集线器类型是"+this.type);
    }
}

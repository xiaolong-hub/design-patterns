package struct.flyweight.first;

public class Switch implements NetWorkDevice {
    private String type;

    public String getType() {
        return this.type;
    }

    public void use() {
        System.out.println("连接的交换机类型是 "+this.type);
    }

    public Switch(String type) {
        this.type = type;
    }
}

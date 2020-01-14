package struct.flyweight.first;

public class Hub implements NetWorkDevice {
    private  String type;

    public Hub(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void use() {
        System.out.println("连接的集线器类型是"+this.type);
    }
}

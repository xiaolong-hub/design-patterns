package struct.flyweight.flyweightself;

public class SwitchSelf implements NetWorkDeviceSelf {
    private String type;


    public String getType() {
        return this.type;
    }

    public SwitchSelf(String type) {
         this.type=type;
    }
    public void use() {
        System.out.println("交换机类型是"+this.type);
    }
}

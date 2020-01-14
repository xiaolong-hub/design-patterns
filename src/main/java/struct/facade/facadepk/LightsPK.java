package struct.facade.facadepk;

public class LightsPK {
    private String location;

    public LightsPK(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location+"灯打开");
    }

    public void off() {
        System.out.println(location+"灯关掉睡觉");
    }

}

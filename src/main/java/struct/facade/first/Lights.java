package struct.facade.first;

public class Lights {
    //灯的私有属性位置
    private String position;

    public Lights(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(this.position + "灯打开");
    }

    public void off() {
        System.out.println(this.position+"灯关掉");
    }
}

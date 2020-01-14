package beahavioral.command.commandfirst;

public class Television {
    //请求的接收者
    public void open() {
        System.out.println("有点无聊,打开电视看个综艺");
    }

    public void  close() {
        System.out.println("有点累,把电视关了休息一下");

    }

    public void change() {
        System.out.println("芒果台好无聊,还央视纪录频道");
    }
}

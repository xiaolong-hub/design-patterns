package beahavioral.command.commandfirst;



public class TVChangeCommand implements AbatractCommamd {
    //声明一个Television类型的TV变量,用于调用请求接收者Television的open方法
    private Television tv;

    public TVChangeCommand() {
        tv = new Television();

    }

    public void execute() {
        tv.change();
    }
}

package beahavioral.state.first;

public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        //设定用户下一个状态
        context.setState(new ConcreteStateB());
        //打印用户当前状态
        System.out.println("吃喝");

    }
}

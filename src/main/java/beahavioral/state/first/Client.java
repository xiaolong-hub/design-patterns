package beahavioral.state.first;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        /**
         * 对象开始切换状态
         */
        context.Resquest();
        context.Resquest();
        context.Resquest();
        context.Resquest();
    }
}

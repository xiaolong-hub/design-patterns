package beahavioral.strategy.first;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteSrategyA();
        Strategy strategy1 = new ConcreteStrategyB();
        Strategy strategy2 = new ConcreteStrategyC();

        Context context=new Context();
        context.setStrategy(strategy);
        context.ContextInterface();

        Context context1=new Context();
        context.setStrategy(strategy2);
        context.ContextInterface();

        Context context2=new Context();
        context.setStrategy(strategy1);
        context.ContextInterface();
    }
}

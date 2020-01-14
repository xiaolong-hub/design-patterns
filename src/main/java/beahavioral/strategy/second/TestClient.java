package beahavioral.strategy.second;

public class TestClient {
    public static void main(String[] args) {
        StrategyInterface strategyInterface=new TestStategyC();
        StrategyInterface strategyInterface1=new TestStategyB();
        StrategyInterface strategyInterface2=new TestStategyA();

        TContext tContext = new TContext();
        tContext.setStrategyInterface(strategyInterface);
        tContext.ContextInterface();

        TContext tContext1=new TContext();
        tContext.setStrategyInterface(strategyInterface1);
        tContext.ContextInterface();

        TContext tContext2=new TContext();
        tContext2.setStrategyInterface(strategyInterface2);
        tContext2.ContextInterface();
    }
}

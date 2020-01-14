package beahavioral.strategy.pk;

public class ClientPK {
    public static void main(String[] args) {
        StrategyPK strategyPK = new ConStrategyA();
        StrategyPK strategyPK1=new ConStrategyB();
        StrategyPK strategyPK2=new ConStrategyC();

        ContextPK contextPK=new ContextPK();
        contextPK.setStrategyPK(strategyPK);
        contextPK.contextInterface();

        ContextPK contextPK1=new ContextPK();
        contextPK1.setStrategyPK(strategyPK1);
        contextPK1.contextInterface();

        ContextPK contextPK2 = new ContextPK();
        contextPK2.setStrategyPK(strategyPK2);
        contextPK2.contextInterface();
    }
}

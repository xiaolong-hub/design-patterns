package beahavioral.strategy.pk;

public class ContextPK {
    private StrategyPK strategyPK;

    public void setStrategyPK(StrategyPK strategyPK) {
        this.strategyPK = strategyPK;
    }

    public void contextInterface() {
        strategyPK.AlogInterface();
    }
}

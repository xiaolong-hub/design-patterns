package beahavioral.strategy.second;

/**
 * 主体对象
 */
public class TContext {
    private StrategyInterface strategyInterface;

    /**
     * 用于客户端具体选择何种算法
     * @param strategyInterface
     */
    public void setStrategyInterface(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }
    /**
     * 当客户端选择了实现具体的算法时,主体对象TContext通过调用StrategyInterface,来调用具体的算法策略
     */

    public void ContextInterface() {
        strategyInterface.AlogInterface();
    }
}

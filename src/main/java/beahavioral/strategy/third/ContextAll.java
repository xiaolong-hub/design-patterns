package beahavioral.strategy.third;

/**
 * @author 李小龙
 * @version 1.0.0
 * @ClassName ContextAll.java
 * @Description TODO
 * @createTime 2020年01月13日 19:02:00
 */
public class ContextAll {
    public Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextAlog() {
        strategy.AlgorithmAll();
    }
}

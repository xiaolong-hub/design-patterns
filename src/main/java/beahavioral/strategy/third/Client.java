package beahavioral.strategy.third;

/**
 * @author 李小龙
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2020年01月13日 18:52:00
 */
public class Client {
    public static void main(String[] args) {

        Strategy strategy = new ConStrategyA();
        Strategy strategy1 = new ConStrategyA();
        Strategy strategy2 = new ConStrategyC();

        ContextAll contextAll = new ContextAll();
        contextAll.setStrategy(strategy );
        contextAll.ContextAlog();


        ContextAll contextAll1 = new ContextAll();
        contextAll.setStrategy(strategy2 );
        contextAll.ContextAlog();


        ContextAll contextAll2 = new ContextAll();
        contextAll.setStrategy(strategy1 );
        contextAll.ContextAlog();

    }

}

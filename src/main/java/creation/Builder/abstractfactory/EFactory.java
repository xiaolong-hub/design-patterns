package creation.Builder.abstractfactory;

public interface EFactory {
    /**
     * 抽象工厂生产两个阐明
     * 空调和冰箱
     */

    //生产空调类型是AirCondition
    public AirCondition productAirCondition();
    //生产电视,类型是TV
    public TV productTv();

}

package creation.Builder.abstractfactory;

public class HairFactory implements EFactory {
    //海尔工厂的产品族包括海尔空调和电视,重写父类的工厂的两个生产空调和电视的方法,返回自身品牌的产品族
    public AirCondition productAirCondition() {
        return new HairAirCondition();
    }

    public TV productTv() {
        return new HairTV();
    }
}

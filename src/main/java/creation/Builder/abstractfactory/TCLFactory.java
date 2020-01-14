package creation.Builder.abstractfactory;

public class TCLFactory implements EFactory {
    //TCL工厂生产自己的产品族(空调和电视)
    public AirCondition productAirCondition() {
        return new TCLAircondition();
    }

    public TV productTv() {
        return new TCLTV();
    }
}

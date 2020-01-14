package creation.Builder.abstractfactory;

public class Client {
    public static void main(String[] args) {
        //现在想要生产海尔的电视和空调
        EFactory eFactory;
        //生产电视
        TV tv;
        //生产空调
        AirCondition airCondition;
        //生产海尔工厂的空调和电视
        eFactory=new HairFactory();

        eFactory.productTv().play();
        eFactory.productAirCondition().play();


    }
}

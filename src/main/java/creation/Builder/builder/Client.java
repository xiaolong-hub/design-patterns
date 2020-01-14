package creation.Builder.builder;

public class Client {
    public static void main(String[] args) {
        BuilderTest builderTest=new ContreteBuilerTest();
        //将建造者具体建造者传给指挥者,由指挥者指挥建造者负责建造产品
        Director director = new Director(builderTest);
        //指挥者开始让指挥建造者建造产品的顺序
        director.construct();

    }
}

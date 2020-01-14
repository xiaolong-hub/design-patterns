package creation.Builder.builder;

public abstract class BuilderTest {
    protected Product product=new Product();
    //抽象的建造者定义两个建造产品的抽象方法由子类去重写方法
    public abstract void buildSize();

    public abstract void buildColor();

    public abstract void buildStytle();

    //声明一个将产品建好后返回建好结果的方法
    public Product getResult(){
        return product;
    }

}

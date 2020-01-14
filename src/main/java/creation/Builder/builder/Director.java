package creation.Builder.builder;

public class Director {
    private BuilderTest builderTest;


    public BuilderTest getBuilderTest() {
        return builderTest;
    }

    public void setBuilderTest(BuilderTest builderTest) {
        this.builderTest = builderTest;
    }

    public Director(BuilderTest builderTest) {
        this.builderTest = builderTest;
    }

    public Product construct() {
        this.builderTest.buildColor();
        this.builderTest.buildSize();
        this.builderTest.buildStytle();
        //调用建造者的getResult方法将建造好的产品返回回去
        return builderTest.getResult();
    }

}

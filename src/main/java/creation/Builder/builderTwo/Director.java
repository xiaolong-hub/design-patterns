package creation.Builder.builderTwo;

public class Director {
    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 开始指挥建造者建造产品的步骤
     * @return
     */
    public  Product construct() {
        this.builder.productOut();
        this.builder.productInner();
        /**
         * 将创建好的产品返回回去
         */
        return this.builder.product;
    }


}

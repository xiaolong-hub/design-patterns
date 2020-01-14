package creation.Builder.builderTwo;

public class ConcreteBuilder extends Builder {
    @Override
    public void productInner() {
        System.out.println("内部生产好了");
    }

    @Override
    public void productOut() {
        System.out.println("外部也生产好了");

    }

    @Override
    public Product getResult() {
        return product;
    }
}

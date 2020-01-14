package creation.Builder.builderTwo;

public abstract class Builder {
    public Product product;

    public abstract void productOut();

    public abstract void productInner();

    public Product getResult() {
        return product;
    }
}

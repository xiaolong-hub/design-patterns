package creation.Builder;

public class Director {
    private Builder builder;

    public Director (Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public Cap construct() {
        this.builder.buildCapInner();
        this.builder.buildCapOutter();
        this.builder.buildCapTop();
        this.builder.finishCap();
        return builder.getResult();
    }
}

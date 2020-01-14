package creation.Builder.Three;

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

    public Cap constract() {
        builder.color();
        builder.material();
        builder.size();
        builder.Type();
        return builder.result();
    }
}

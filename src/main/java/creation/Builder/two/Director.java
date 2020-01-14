package creation.Builder.two;

public class Director {

    public Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Tshirt costruct() {
        builder.color();
        builder.stytle();
        builder.color();
        builder.size();

        return builder.getResult();
    }
}

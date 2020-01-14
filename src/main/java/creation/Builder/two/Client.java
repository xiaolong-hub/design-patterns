package creation.Builder.two;

public class Client {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director = new Director(builder);
        director.costruct();
    }
}

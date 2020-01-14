package creation.Builder.Three;

public class Client {
    public static void main(String[] args) {
        Builder builder = new CapBuilder();
        Director director = new Director(builder);
        director.constract();
    }
}

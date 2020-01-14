package creation.Builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new CapBuilder();
        Director director = new Director(builder);
        Cap cap = director.construct();
    }
}

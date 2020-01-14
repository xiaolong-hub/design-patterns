package beahavioral.state.second;

public class Client {
    public static void main(String[] args) {
        TContext tContext = new TContext(new CStateA());
        tContext.RequestHandle();
        tContext.RequestHandle();
        tContext.RequestHandle();
        tContext.RequestHandle();
    }
}

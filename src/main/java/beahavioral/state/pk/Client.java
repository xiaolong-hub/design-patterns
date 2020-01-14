package beahavioral.state.pk;

public class Client {
    public static void main(String[] args) {
        ContextPK contextPK = new ContextPK(new CStateAPK());
        contextPK.Request();
        contextPK.Request();
        contextPK.Request();
        contextPK.Request();
    }
}

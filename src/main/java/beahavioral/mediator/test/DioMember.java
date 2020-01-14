package beahavioral.mediator.test;

public class DioMember extends TMember{
    public DioMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("VIP发送图片");
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("VIP 发送图片");
    }
}

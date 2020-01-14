package beahavioral.mediator.pk;

public class CommandMember extends Member{
    public CommandMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String from, String to, String message) {
        System.out.println("普通会员开始发送消息");
        System.out.println();
    }

    @Override
    public void sendImage(String from, String to, String image) {
        System.out.println("普通会员无法发送图片");
    }
}

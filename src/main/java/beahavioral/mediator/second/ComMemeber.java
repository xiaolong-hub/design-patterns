package beahavioral.mediator.second;

public class ComMemeber extends AbstractMember {
    public ComMemeber(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {

        System.out.println("普通会员发消息");
        roomChat.sendText(name,to,message);


    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("开通会员后方可发送消息");


    }
}

package beahavioral.mediator.test;

import beahavioral.memento.test.TMemento;

public class ComMember extends TMember {

    public ComMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送消息");
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不可发送图片");
    }
}

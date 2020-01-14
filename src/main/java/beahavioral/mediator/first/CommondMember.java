package beahavioral.mediator.first;

import java.lang.reflect.Method;

public class CommondMember extends Member{
    public CommondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息:");
        //发送文本
        chatroom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片");
    }
}

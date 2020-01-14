package beahavioral.mediator.pk;

import java.util.Hashtable;

public class Chatroom extends AbstractChatroom {
    private Hashtable members = new Hashtable();


    @Override
    public void register(Member member) {
        if (!members.contains(member)) {
            //getname是key member是value,根据key去获取真正的聊天成员
            members.put(member.getName(), member);
            member.setChatroom(this);

        }
    }

    /**
     * 对发送的信息进行过滤
     * @param name
     * @param to
     * @param message
     */
    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) members.get(to);
        String newMessage = message;
        newMessage = message.replaceAll("靠", "$");
        member.receiveText(from,newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        if (image.length() > 6) {
            System.out.println("图片太大了,发送失败!");
        } else {
            member.receiveImage(from, image);
        }


    }
}

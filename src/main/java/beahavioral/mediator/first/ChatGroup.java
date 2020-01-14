package beahavioral.mediator.first;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {
    /**
     *聊天成员
     */
    public Hashtable members=new Hashtable();

    @Override
    public void register(Member member) {
        /**
         * 比较members中是否包含该聊天成员
         */
        if (!members.contains(member)) {
            members.put(member.getName(), member);
            //放入聊天室
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) members.get(to);
        String newMessage = message;
        //模拟不雅字符过滤,检查发送信息中是否有敏感词汇,如果有则敏感词汇替换掉
        newMessage = message.replaceAll("操", "*");
        member.receiveText(from,newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        //模拟图片大小,检查发送的图片大小
        if (image.length() > 5) {
            System.out.println("图片太大,发送失败!");
        } else {
            member.receiveImage(from,image);
        }
    }
}

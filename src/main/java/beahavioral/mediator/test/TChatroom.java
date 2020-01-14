package beahavioral.mediator.test;

import java.util.Hashtable;

public  class TChatroom extends TAbstractChatroom{

    private Hashtable members = new Hashtable();

    /**
     * 将成员注册进聊天室
     * @param tMember
     */
    @Override
    public void register(TMember tMember) {
        //判断成员是否已经在HashTable中存在吗
        if (!members.contains(tMember)) {
            //以成员姓名为key,具体成员为value
            members.put(tMember.getName(), members);
            //将此成员注册聊天室内
            tMember.settAbstractChatroom(this);
        }

    }

    @Override
    public void sendText(String from, String to, String message) {
        TMember member = (TMember) members.get(to);
        String newMessage=message;
        newMessage = message.replaceAll("操", "*");
        member.settAbstractChatroom(this);
    }

    @Override
    public void sentImage(String from, String to, String image) {
        TMember member = (TMember) members.get(to);
        //判断图片大小
        if (image.length() > 5) {
            System.out.println("图片太大,发送失败!");
        } else {
            member.receivedImage(from,image);
        }


    }
}

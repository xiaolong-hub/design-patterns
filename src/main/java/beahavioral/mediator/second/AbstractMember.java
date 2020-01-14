package beahavioral.mediator.second;

public abstract class AbstractMember {
    protected String name;
    protected AbsChatroom roomChat;

    public AbstractMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbsChatroom getRoomChat() {
        return roomChat;
    }

    public void setRoomChat(AbsChatroom roomChat) {
        this.roomChat = roomChat;
    }

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    //接收文本
    public void receiveText(String from, String message) {
        System.out.println(from+"发送文本给"+this.name+",内容为:"+message);
    }

    //接收图片
    public void receiveImage(String from, String messae) {
        System.out.println(from);
    }
}

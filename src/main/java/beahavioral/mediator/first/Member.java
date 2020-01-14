package beahavioral.mediator.first;

public abstract class Member {
    /**
     * 聊天成员依赖聊天室
     */
    protected AbstractChatroom chatroom;
    /**
     * 聊天成员的姓名
     */
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    /**
     * 接收文字内容
     * @param from      接收者
     * @param message   发送文本信息
     */
    public void receiveText(String from, String message) {
        System.out.println(from+"发送文本给:"+this.name+"内容为:"+message);
    }

    /**
     * 接收送图片
     * @param from      接收者
     * @param image     发送图片内容
     */
    public void receiveImage(String from, String image) {
        System.out.println(from+"发送图片给:"+this.name+"内容为:"+image);
    }
}

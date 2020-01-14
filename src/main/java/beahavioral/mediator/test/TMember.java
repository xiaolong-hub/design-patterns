package beahavioral.mediator.test;

public abstract class TMember {
    //成员聊天需要有一个聊天室内
    protected TAbstractChatroom tAbstractChatroom;
    //聊天人的姓名
    protected String name;

    public TMember(String name) {
        this.name=name;
    }
    public TAbstractChatroom gettAbstractChatroom() {
        return tAbstractChatroom;
    }

    public void settAbstractChatroom(TAbstractChatroom tAbstractChatroom) {
        this.tAbstractChatroom = tAbstractChatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员需要发送消息发送给谁
    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    //成员接收到来自谁发送的内容
    public void receivedText(String from, String message) {
        System.out.println(from+"发送文本给"+this.name+"内容为:"+message);
    }

    public void receivedImage(String from, String image) {
        System.out.println(from+"发送图片给:"+this.name+"内容为:"+image);
    }


}

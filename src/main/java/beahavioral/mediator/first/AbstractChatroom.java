package beahavioral.mediator.first;

public abstract class AbstractChatroom {

    /**
     * 将发送消息者注册到中介者(聊天室)中
     * @param member
     */
    public abstract void register(Member member);

    /**
     * 发送文字方法
     * @param from    由谁发送
     * @param to      由谁接收(发给谁)
     * @param message 发送内容
     */
    public abstract void sendText(String from, String to, String message);

    /**
     * 发送图片方法
     * @param from      图片发送者
     * @param to        图片接收者
     * @param image     发送图片
     */
    public abstract void sendImage(String from, String to, String image);
}

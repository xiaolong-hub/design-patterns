package beahavioral.mediator.first;

public class ClientMediator {
    public static void main(String[] args) {
        AbstractChatroom happChat=new ChatGroup();
        Member member1,member2,member3,member4,member5;
        member1 = new DiamondMember("明慧");
        member2 = new CommondMember("白靖");
        member3 = new DiamondMember("小波");
        member4 = new DiamondMember("娜姐");
        member5 = new CommondMember("小龙");

        happChat.register(member1);
        happChat.register(member2);
        happChat.register(member3);
        happChat.register(member4);
        happChat.register(member5);

        //发送者以及发送者内容
        member1.sendText("明慧", "明慧你真好看");
        member2.sendText("小龙", "走小波游泳去");
        member3.sendText("娜姐", "白靖走咱俩拍照去");
        member4.sendText("白靖", "娜姐我不去拍照了,咱们去大悦城逛街怎么样");
        member5.sendText("明慧", "谢谢小龙,不过我一直是这么风华绝代");

        member2.sendText("小龙", "我操,好大的太阳");
        member3.sendText("娜姐", "我操,快看真的好大的太阳");
        member1.sendImage("明慧", "娜姐你的照片");
        member3.sendImage("白靖", "娜姐你把照片发我吧");
        member4.sendImage("小龙","照片给娜姐");
    }
}

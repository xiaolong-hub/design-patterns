package beahavioral.mediator.test;

import beahavioral.mediator.first.ChatGroup;

public class Client {
    public static void main(String[] args) {
        TAbstractChatroom happyChat = new TChatroom();
        TMember m1,m2,m3,m4,m5;
        m1 = new DioMember("李娜");
        m2 = new ComMember("蒙蒙");
        happyChat.register(m1);
        happyChat.register(m2);

        m1.receivedText("明慧", "李娜你好,操");
        m2.receivedText("李娜", "我好蒙圈,操");
        m1.receivedImage("明慧","好多太阳");

    }

}

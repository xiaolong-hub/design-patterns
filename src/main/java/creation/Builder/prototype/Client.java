package creation.Builder.prototype;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //定义一个原型 和一个要复制的原型
        Email email,copyEmail=null;
        //实例化一个要复制的对象
        email = new Email();
        try {
            //开始复制原型运用deepClone()方法
            copyEmail = (Email) email.deepClone();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("email==copyEmail ?");
        if (email == copyEmail) {
            System.out.println("这是浅复制");
        } else {
            System.out.println("email 与不相等 copyEmail 这是深复制");
        }

        System.out.println("email.getAttachement==copyEmail.getAttachement ?");
        if (email.getAttachment() == copyEmail.getAttachment()) {
            System.out.println("email.getAttachement==copyEmail.getAttachement相等是浅复制");
        } else {
            System.out.println("email.getAttachement 不相等 copyEmail.getAttachement相等是深复制");
        }

    }
}

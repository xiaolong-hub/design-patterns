package creation.prototype;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //定义一个复制对象和被复制对象
        Email email, copyEmail = null;
        email=new Email();

        copyEmail = (Email) (email).deepClone();

    }
}

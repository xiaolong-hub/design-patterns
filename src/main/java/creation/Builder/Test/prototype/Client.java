package creation.Builder.Test.prototype;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Email email ,copyEmail=null;
        email=new Email();
        //
        copyEmail = (Email) email.deepCopy();

        System.out.println("email==copyEmail");
        System.out.println(email==copyEmail);

    }
}

package creation.Builder.prototype;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment=null;

    public Email() {
        this.attachment = new Attachment();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //将要复制的对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将复制好的对象从流中取出
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return(ois.readObject());

    }

    public Attachment getAttachment() {
        return this.attachment;
    }
    public void display() {
        System.out.println("查看邮件");
    }


}

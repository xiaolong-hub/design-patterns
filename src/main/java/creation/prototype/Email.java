package creation.prototype;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }
    public Email() {
        this.attachment = new Attachment();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //将文件放入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        //将复制的对象写入流内存中
        oos.writeObject(this);

        //将复制对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        //将对象从内存中输出并返回
        return (ois.readObject());
    }

    public void dispaly() {
        System.out.println("查看邮件");
    }

}

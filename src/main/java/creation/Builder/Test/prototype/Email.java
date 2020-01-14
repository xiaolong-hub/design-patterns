package creation.Builder.Test.prototype;

import java.io.*;

public class Email implements Serializable {
    private Accesslemt accesslemt;

    public Accesslemt getAccesslemt() {
        return accesslemt;
    }

    public Email() {
        this.getAccesslemt();
    }

    public Object deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }
}

package beahavioral.memento.pk;

public class Client {
    public static void main(String[] args) {
        PUserinfo user = new PUserinfo();
        PCaretaker pCaretaker = new PCaretaker();

        user.setAge(23);
        user.setName("牛兰兰");
        user.setSex("女");
        System.out.println("状态一:");
        user.show();
        //用pCaretaker来保存第一次的信息
        pCaretaker.setpMemento(user.savePMemento());

        System.out.println("---------------");
        user.setSex("女");
        user.setName("牛兰兰");
        user.setAge(30);
        System.out.println("状态二:");
        user.show();

        System.out.println("----------------");
        //恢复自己第一次的状态
        user.restorMemento(pCaretaker.getpMemento());
        user.show();
    }
}

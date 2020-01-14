package beahavioral.memento.test;

public class TClient {
    public static void main(String[] args) {
        TUserInfo user=new TUserInfo();
        TCaretaker caretaker = new TCaretaker();

        user.setAge(23);
        user.setName("牛拉篮");
        user.setSex("女");
        System.out.println("状态一:");
        caretaker.settMemento(user.saveMemnto());
        user.show();

        System.out.println("-----------");

        user.setAge(45);
        user.setName("牛拉篮");
        user.setSex("女");
        System.out.println("状态二:");
        user.show();

        System.out.println("-----------");
        user.restorMemnto(caretaker.gettMemento());
        user.show();

    }
}

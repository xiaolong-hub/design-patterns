package beahavioral.memento.second;

public class Client {
    public static void main(String[] args) {
        SUserinfoDTO user = new SUserinfoDTO();
        SCaretaker sCaretaker=new SCaretaker();
        user.setSex("男");
        user.setName("牛蓝山");
        user.setAge(25);
        System.out.println("状态一:");
        user.show();

        sCaretaker.setsMemento(user.saveMemento());

        System.out.println("----------------------");
        user.setAge(10);
        user.setName("牛蓝山");
        user.setSex("男");
        System.out.println("状态二:");
        user.show();
        System.out.println("----------------------");

        //恢复到状态一
        user.restoreMemento(sCaretaker.getsMemento());
        user.show();

    }
}

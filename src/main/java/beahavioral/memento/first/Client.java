package beahavioral.memento.first;

public class Client {
    public static void main(String[] args) {
        UserinfoDTO user = new UserinfoDTO();
        Caretaker caretaker = new Caretaker();

        user.setAccount("8899");
        user.setPassword("6666");
        user.setTelNO("13677886898");
        System.out.println("状态1:");
        user.show();
        caretaker.setMemento(user.saveMemento());


        System.out.println("------------------------------");

        user.setPassword("00000000");
        user.setAccount("56666667777777778");
        user.setTelNO("1010101010101010110");
        System.out.println("状态二:");
        user.show();
        System.out.println("------------------------------");

        user.restoreMemoto(caretaker.getMemento());
        user.show();
        System.out.println("----------------------------");
    }
}

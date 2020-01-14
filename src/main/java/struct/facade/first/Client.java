package struct.facade.first;

public class Client {

    public static void main(String[] args) {
        GeneralSwithFacade generalSwithFacade = new GeneralSwithFacade();

        generalSwithFacade.on();
        System.out.println("===================");
        generalSwithFacade.off();
    }
}

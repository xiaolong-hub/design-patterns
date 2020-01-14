package struct.facade.facadetest;

public class Client {
    public static void main(String[] args) {
        GeneFacade geneFacade=new GeneFacade();
        geneFacade.on();
        System.out.println("=============");
        geneFacade.off();
    }
}

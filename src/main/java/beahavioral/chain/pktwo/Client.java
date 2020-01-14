package beahavioral.chain.pktwo;

public class Client {
    public static void main(String[] args) {

        LeaderTwo objDirector,objManager,objGeneralMangaer;

        RequestTwo requestTwo1,requestTwo2,requestTwo3,requestTwo4;

        objDirector = new DierctorTwo("王小波");
        objManager = new ManagerTwo("白靖");
        objGeneralMangaer = new GeneralManagerTwo("李小龙");

        objDirector.setSeccossor(objManager);
        objManager.setSeccossor(objGeneralMangaer);

        requestTwo1 = new RequestTwo("任蒙蒙", 2);
        objDirector.handleRequest(requestTwo1);

        requestTwo2 = new RequestTwo("严文文", 8);
        objDirector.handleRequest(requestTwo2);

        requestTwo3 = new RequestTwo("任晓帅", 28);
        objDirector.handleRequest(requestTwo3);

        requestTwo4 = new RequestTwo("李娜", 42);
        objDirector.handleRequest(requestTwo4);
    }
}

package beahavioral.command.commandpk;

public class Client {
    public static void main(String[] args) {
        /**
         * 声明命令的传递者,此处有三个命令开电视,关电视,换台
         */
        PKAbatractCommand objTVOpen, objTVClose, objTVChange;

        objTVChange=new PKTVChange();
        objTVClose=new PKTVClose();
        objTVOpen=new PKTVOpen();

        ControllerPK controllerPK = new ControllerPK(objTVChange, objTVClose, objTVOpen);
        controllerPK.change();
        controllerPK.close();
        controllerPK.open();
    }

}

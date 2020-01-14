package beahavioral.command.commandpk;

public class ControllerPK {
   private PKAbatractCommand PKTVChange,PKTVClose,PKTVOpen;

    public ControllerPK(PKAbatractCommand PKTVChange, PKAbatractCommand PKTVClose, PKAbatractCommand PKTVOpen) {
        this.PKTVChange = PKTVChange;
        this.PKTVClose = PKTVClose;
        this.PKTVOpen = PKTVOpen;
    }
    public void open() {
        PKTVOpen.excute();
    }

    public void close() {
        PKTVClose.excute();
    }

    public void change() {
        PKTVChange.excute();
    }
}

package beahavioral.command.commandpk;

public class PKTVOpen implements PKAbatractCommand{
    private PKTelevision tv;

    public PKTVOpen() {
        tv=new PKTelevision();
    }
    public void excute() {
        tv.open();
    }
}

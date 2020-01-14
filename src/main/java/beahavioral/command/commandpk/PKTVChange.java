package beahavioral.command.commandpk;

public class PKTVChange implements PKAbatractCommand {
    private PKTelevision tv;

    public PKTVChange() {
        tv=new PKTelevision();
    }


    public void excute() {
        tv.change();
    }
}

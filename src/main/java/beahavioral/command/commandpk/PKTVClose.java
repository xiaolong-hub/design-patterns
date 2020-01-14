package beahavioral.command.commandpk;

public class PKTVClose implements PKAbatractCommand {
    private PKTelevision tv;

    public PKTVClose() {
        tv=new PKTelevision();
    }

    public void excute() {
        tv.close();
    }
}

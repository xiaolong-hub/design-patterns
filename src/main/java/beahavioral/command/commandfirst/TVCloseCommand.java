package beahavioral.command.commandfirst;



public class TVCloseCommand implements AbatractCommamd {
    private Television tv;

    public TVCloseCommand( ) {
        tv=new Television();
    }

    public void execute() {
        tv.close();
    }
}

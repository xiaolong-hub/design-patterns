package beahavioral.command.commandfirst;



public class TVOpenCommand implements AbatractCommamd {
    private Television tv;

    public TVOpenCommand( ) {
        tv=new Television();
    }

    //打开电视
    public void execute() {
        tv.open();
    }
}

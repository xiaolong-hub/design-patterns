package beahavioral.command.commandfirst;


import beahavioral.chain.first.Controller;

public class Client {
    public static void main(String[] args) {

        AbatractCommamd openCommand,changeCommand,closeCommand;

        openCommand=new TVOpenCommand();
        closeCommand=new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller controller = new Controller(openCommand, closeCommand, changeCommand);
        controller.change();
        controller.close();
        controller.open();

    }

}

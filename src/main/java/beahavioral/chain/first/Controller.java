package beahavioral.chain.first;

import beahavioral.command.commandfirst.AbatractCommamd;

public class Controller {
    private AbatractCommamd openCommand,closeCommand,changeCommand;

    public Controller(AbatractCommamd openCommand, AbatractCommamd closeCommand, AbatractCommamd changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open() {
        openCommand.execute();
    }
    public void close() {
        closeCommand.execute();
    }
    public void change() {
        changeCommand.execute();
    }
}

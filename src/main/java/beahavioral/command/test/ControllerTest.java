package beahavioral.command.test;

public class ControllerTest {
    private AbstractCommandTest objOpen,objClose,objChange;

    public ControllerTest(AbstractCommandTest objOpen, AbstractCommandTest objClose, AbstractCommandTest objChange) {
        this.objOpen = objOpen;
        this.objClose = objClose;
        this.objChange = objChange;
    }
    public void open() {
        objOpen.excute();

    }
    public void close() {
        objClose.excute();

    }
    public void change() {
        objChange.excute();
    }

}

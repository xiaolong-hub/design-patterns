package beahavioral.state.test;

public class SleepState extends State {
    @Override
    public void handle(ContextTest contextTe) {
        System.out.println("睡觉");
        contextTe.setState(new EatState());
    }
}

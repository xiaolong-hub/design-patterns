package beahavioral.state.first;

public class ConcreteStateC extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
        System.out.println("睡");
    }
}

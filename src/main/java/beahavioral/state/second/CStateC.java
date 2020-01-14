package beahavioral.state.second;

public class CStateC extends TState {
    @Override
    public void Handle(TContext tContext) {
        System.out.println("睡");
        tContext.settState(new CStateA());
    }
}

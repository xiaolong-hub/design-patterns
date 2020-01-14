package beahavioral.state.second;

public class CStateB extends TState {
    @Override
    public void Handle(TContext tContext) {
        System.out.println("玩乐");
        tContext.settState(new CStateC());

    }
}

package beahavioral.state.second;

import beahavioral.state.first.Context;

public class CStateA extends TState {
    @Override
    public void Handle(TContext Tcontext) {
        System.out.println("吃喝");
        Tcontext.settState(new CStateB());
    }
}

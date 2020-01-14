package beahavioral.state.second;

public class TContext {
    private TState tState;

    public TContext(TState tState) {
        this.tState = tState;
    }

    /**
     * 设置当前对象的心状态
     * @param tState
     */
    public void settState(TState tState) {
        this.tState = tState;
        System.out.println("当前状态" + tState.getClass().getTypeName());
    }

    /**
     * 当前状态
     */
    public void RequestHandle() {
        tState.Handle(this);
    }
}

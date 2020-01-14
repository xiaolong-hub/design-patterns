package beahavioral.state.test;

public class ContextTest {
    private State state;

    public void setState(State state) {
        this.state = state;


    }

    public ContextTest(State state) {
        this.state = state;
        System.out.println("当前状态:"+state.getClass().getTypeName());
    }

    public void request( ) {
        state.handle(this);
    }
}

package beahavioral.state.pk;

public class ContextPK {
    private StatePK statePK;

    public ContextPK(StatePK statePK) {
        this.statePK = statePK;
    }

    public void setStatePK(StatePK statePK) {
        this.statePK = statePK;
        System.out.println("当前状态"+statePK.getClass().getTypeName());
    }


    public void Request() {
        statePK.Handle(this);

    }
}

package beahavioral.state.pk;

public class CStateAPK extends StatePK {
    @Override
    public void Handle(ContextPK contextPK) {
        System.out.println("喝睡");
        contextPK.setStatePK(new CStateBPK());

    }
}

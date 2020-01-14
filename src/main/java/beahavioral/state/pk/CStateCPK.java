package beahavioral.state.pk;

public class CStateCPK extends StatePK {
    @Override
    public void Handle(ContextPK contextPK) {
        System.out.println("玩乐");
        contextPK.setStatePK(new CStateAPK());
    }
}

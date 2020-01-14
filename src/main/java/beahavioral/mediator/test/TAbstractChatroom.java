package beahavioral.mediator.test;

public abstract class TAbstractChatroom {
    public abstract void register(TMember tMember);

    public abstract void sendText(String from, String to, String message);

    public abstract void sentImage(String from, String to, String image);

}

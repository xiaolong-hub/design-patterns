package beahavioral.mediator.second;

import beahavioral.mediator.first.Member;

public abstract class AbsChatroom {
    public abstract void regist(AbstractMember abstractMember);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String message);



}

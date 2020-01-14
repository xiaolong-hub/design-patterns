package beahavioral.mediator.second;

import java.util.Hashtable;

public class GroupChat extends AbsChatroom {
    private Hashtable groupMember = new Hashtable();

    @Override
    public void regist(AbstractMember abstractMember) {
        if (!groupMember.contains(abstractMember)) {
            groupMember.put(abstractMember.getName(), abstractMember);
            abstractMember.setRoomChat(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        AbstractMember abstractMember = (AbstractMember) groupMember.get(to);
        String newMessage=message;
        newMessage = message.replaceAll("靠", "*");
        abstractMember.receiveText(from,newMessage);

    }

    @Override
    public void sendImage(String from, String to, String message) {

    }
}

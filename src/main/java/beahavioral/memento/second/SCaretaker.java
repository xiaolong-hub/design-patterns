package beahavioral.memento.second;

public class SCaretaker {
    private SMemento sMemento;

    public SMemento getsMemento() {
        return sMemento;
    }

    public void setsMemento(SMemento sMemento) {
        this.sMemento = sMemento;
    }
}

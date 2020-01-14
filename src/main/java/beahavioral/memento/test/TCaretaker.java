package beahavioral.memento.test;

public class TCaretaker {
    private TMemento tMemento;

    public TMemento gettMemento() {
        return tMemento;
    }

    public void settMemento(TMemento tMemento) {
        this.tMemento = tMemento;
    }
}

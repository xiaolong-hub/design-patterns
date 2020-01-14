package beahavioral.interpreter.PK;

import beahavioral.interpreter.second.Node;

public class ValueNodePk implements NodePK {

    private int value;

    public ValueNodePk(int value) {
        this.value = value;
    }

    public int interputer() {
        return this.value;

    }
}

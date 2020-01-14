package beahavioral.interpreter.second;

public class ValueNodeTwo implements Node {
    private int value;

    public int interpretTwo() {

        return this.value;

    }

    public ValueNodeTwo(int value) {
        this.value = value;
    }
}

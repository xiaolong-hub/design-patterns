package creation.Builder.Three;

public abstract class Builder {
    protected Cap cap = new Cap();
    public abstract void color();

    public abstract void size();

    public abstract void material();

    public abstract void Type();

    public Cap result() {
        return cap;

    }


}

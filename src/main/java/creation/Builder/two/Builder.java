package creation.Builder.two;

public abstract class Builder {

    protected Tshirt tshirt=new Tshirt();

    public abstract void color();

    public abstract void stytle();

    public abstract void size();

    public abstract void material();

    public Tshirt getResult() {
        return tshirt;
    }
}

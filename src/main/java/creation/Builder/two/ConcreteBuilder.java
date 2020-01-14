package creation.Builder.two;

public class ConcreteBuilder extends Builder {

    @Override
    public void color() {
        System.out.println("大红色");
    }

    @Override
    public void stytle() {
        System.out.println("坎肩");
    }

    @Override
    public void size() {
        System.out.println("M号");
    }

    @Override
    public void material() {
        System.out.println("纯棉");
    }


}

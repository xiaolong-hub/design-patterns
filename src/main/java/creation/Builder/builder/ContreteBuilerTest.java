package creation.Builder.builder;

public class ContreteBuilerTest extends BuilderTest {
    @Override
    public void buildColor() {
        System.out.println("万紫千红");

    }

    @Override
    public void buildSize() {
        System.out.println("M号");
    }

    @Override
    public void buildStytle() {
        System.out.println("当今最时髦款式");
    }

}

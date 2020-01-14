package creation.Builder;

public class CapBuilder extends Builder {

    @Override
    public void buildCapInner() {
        System.out.println("内胆生产好了304不锈钢");
    }

    @Override
    public void buildCapOutter() {
        System.out.println("杯身24k钛合金");
    }

    @Override
    public void buildCapTop() {
        System.out.println("镶钻青花瓷");
    }
    @Override
    public void finishCap() {
        System.out.println("杯子生产好了拿去用吧");
    }
}

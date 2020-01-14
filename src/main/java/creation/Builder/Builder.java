package creation.Builder;

public abstract class Builder {
    //要生产的产品
    protected Cap client;
    //生产杯盖
    public abstract void buildCapTop();
    //生产杯子内胆
    public abstract void buildCapInner();
    //生产杯子外壳
    public abstract void buildCapOutter();

    //将杯子组合好
    public abstract void finishCap();

    //将生产好的杯子返回回去
    public Cap getResult() {
        return client;
    }
}

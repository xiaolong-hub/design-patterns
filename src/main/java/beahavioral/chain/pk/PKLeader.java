package beahavioral.chain.pk;


public abstract class PKLeader {
    //审批人姓名
    protected String name;
    //下一个审批人,后继对象
    protected PKLeader successor;

    //其他类可以调用下一个审批者
    public void setSuccessor(PKLeader successor) {
        this.successor = successor;
    }

    //获取审批者的名字
    public PKLeader(String name) {
        this.name = name;
    }

    //处理请求的方法
    public abstract void handleResuqst(PkLeaveRequest pkLeaveRequest);
}

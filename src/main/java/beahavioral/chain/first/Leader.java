package beahavioral.chain.first;

public abstract class Leader {
    //审批人的姓名
    protected String name;
    //有权限审批的人
    protected Leader  succeessor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSucceessor(Leader succeessor) {
        this.succeessor = succeessor;
    }

    public void handleRequest(LeaveRequest request) {

    }
}

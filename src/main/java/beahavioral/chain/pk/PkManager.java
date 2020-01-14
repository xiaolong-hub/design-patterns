package beahavioral.chain.pk;

public class PkManager extends PKLeader {
    public PkManager(String name) {
        super(name);
    }

    @Override
    public void handleResuqst(PkLeaveRequest pkLeaveRequest) {
        if (pkLeaveRequest.getLeaveDay() < 10) {
            System.out.println("经理" + name + "审批员工" + pkLeaveRequest.getName() + "的请假条,请假天数为" + pkLeaveRequest.getLeaveDay() + "天");
        } else {
            //如果还有下一级审批者,则将审批权限交由下一级审批者审批
            if (this.successor != null) {
                this.successor.handleResuqst(pkLeaveRequest);
            }
        }
    }
}

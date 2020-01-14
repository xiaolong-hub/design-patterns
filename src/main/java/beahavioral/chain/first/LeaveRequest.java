package beahavioral.chain.first;

public class LeaveRequest {
    //请假天数
    private int leaveDays;
    //请假人姓名
    private String leaveName;

    //审判者可以获得请假的天数进行审批
    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    //假期审批者可以获得请假人姓名
    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public LeaveRequest(String leaveName, int leaveDays) {
        this.leaveDays=leaveDays;
        this.leaveName = leaveName;
    }
}

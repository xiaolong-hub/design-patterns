package beahavioral.chain.pk;


public class PkLeaveRequest {
    //请求者姓名
    private String name ;
    //请假者请假天数
    private int leaveDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部可以获取请假天数
    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leave) {
        this.leaveDay = leaveDay;
    }

    public void pklevelRequest(String name, int leaveDay) {
        this.name=name;
        this.leaveDay=leaveDay;

    }

}

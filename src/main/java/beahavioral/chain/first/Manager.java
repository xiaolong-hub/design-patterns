package beahavioral.chain.first;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("主任" + name + "审批员工" + request.getLeaveName() + "的请假条,请假天数为" + request.getLeaveDays() + "天");

        } else {
            if (this.succeessor != null) {
                this.succeessor.handleRequest(request);
            }
        }
    }
}

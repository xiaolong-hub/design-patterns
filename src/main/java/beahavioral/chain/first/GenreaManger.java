package beahavioral.chain.first;

public class GenreaManger extends Leader{
    public GenreaManger(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("总经理" + name + "审批员工" + request.getLeaveName() + "的请假条,请假天数为" + request.getLeaveDays() + "天" + "保重身体呀!");
        } else {
            System.out.println("莫非"+request.getLeaveName()+"不想干了?,居然请"+request.getLeaveDays()+"天假");
        }


    }
}

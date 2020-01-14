package beahavioral.chain.pktwo;

public class GeneralManagerTwo extends LeaderTwo {
    @Override
    public void handleRequest(RequestTwo requestTwo) {
        if (requestTwo.getLevealDay() < 30) {
            System.out.println("总经理" + this.name + "审批同意了" + requestTwo.getLevealName() + "的" + requestTwo.getLevealDay() + "假期");
        } else {
            System.out.println(requestTwo.getLevealName()+"是不是不想干了,竟然请假"+requestTwo.getLevealDay()+"天");
        }
    }

    public GeneralManagerTwo(String name) {
        super(name);
    }
}

package beahavioral.chain.pktwo;

public class ManagerTwo extends LeaderTwo{
    public ManagerTwo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(RequestTwo requestTwo) {
        if (requestTwo.getLevealDay() < 10) {
            System.out.println("经理" + this.name + "审批同意了" + requestTwo.getLevealName() + "的" + requestTwo.getLevealDay() + "假期");
        } else {
            if (seccossor != null) {
                this.seccossor.handleRequest(requestTwo);
            }
        }
    }
}

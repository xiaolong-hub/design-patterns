package beahavioral.chain.pktwo;

public class DierctorTwo extends LeaderTwo {


    public DierctorTwo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(RequestTwo requestTwo) {
        if (requestTwo.getLevealDay() < 3) {
            System.out.println("主任" + this.name + "审批同意了" + requestTwo.getLevealName() + "的" + requestTwo.getLevealDay() + "假期");
        } else {
            if (seccossor != null) {
                this.seccossor.handleRequest(requestTwo);
            }
        }

    }
}

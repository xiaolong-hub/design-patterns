package beahavioral.chain.pktwo;

public abstract class LeaderTwo {
    protected String name ;
    protected LeaderTwo seccossor;

    public LeaderTwo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setSeccossor(LeaderTwo seccossor) {
        this.seccossor = seccossor;
    }


    public abstract void handleRequest(RequestTwo requestTwo);

}

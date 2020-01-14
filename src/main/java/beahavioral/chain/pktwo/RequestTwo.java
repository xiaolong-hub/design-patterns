package beahavioral.chain.pktwo;

public class RequestTwo {
    private String levealName;

    private int levealDay;

    public String getLevealName() {
        return levealName;
    }

    public void setLevealName(String levealName) {
        this.levealName = levealName;
    }

    public int getLevealDay() {
        return levealDay;
    }

    public void setLevealDay(int levealDay) {
        this.levealDay = levealDay;
    }


    public RequestTwo(String levealName, int levealDay) {
        this.levealDay=levealDay;
        this.levealName = levealName;
    }
}

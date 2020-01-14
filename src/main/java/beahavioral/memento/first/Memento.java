package beahavioral.memento.first;

public class Memento {
    private String account;
    private String password;
    private String telNO;

    public Memento(String account, String password, String telNO) {
        this.account = account;
        this.password = password;
        this.telNO = telNO;
    }

    public String getTelNO() {
        return telNO;
    }

    public void setTelNO(String telNO) {
        this.telNO = telNO;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

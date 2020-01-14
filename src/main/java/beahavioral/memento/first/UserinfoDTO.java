package beahavioral.memento.first;

public class UserinfoDTO {
    private String account;
    private String password;
    private String telNO;

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

    public String getTelNO() {
        return telNO;
    }

    public void setTelNO(String telNO) {
        this.telNO = telNO;
    }

    public Memento saveMemento() {
        return new Memento(account, password, telNO);
    }

    public void restoreMemoto(Memento memento) {
        this.telNO=memento.getAccount();
    }

    public void  show() {
        System.out.println("Account:"+this.account);
        System.out.println("Password:" + this.password);
        System.out.println("telNO:"+this.telNO);

    }
}

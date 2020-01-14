package struct.proxy.proxypk;

public class PkRealPermissionProxy implements PkAbstractPermission{

    PkPerssionProxy pkPerssionProxy = new PkPerssionProxy();
    private int level=0;

    public void modifInfo() {
        if (0 == level) {
            System.out.println("sorry ,无权修改用户信息");

        } else if (1 == level) {
            pkPerssionProxy.modifInfo();
        }
    }

    public void viewInfo() {
        System.out.println("正在看陈道明的帖子");
    }

    public void setLevel(int level) {
        this.level = level;

    }

    public void modifNote() {
        if (0 == level) {
            System.out.println("sorry ,无权修改用户评论");
        }

    }
}

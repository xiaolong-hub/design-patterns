package struct.proxy.proxypk;

public class PkPerssionProxy implements PkAbstractPermission{
    public void modifInfo() {

        System.out.println("修改信息");
    }

    public void viewInfo() {
        System.out.println("正在看陈道明的帖子");
    }

    public void setLevel(int level) {

    }

    public void modifNote() {
        System.out.println("修改评论");


    }
}

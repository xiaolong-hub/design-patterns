package struct.proxy.first;

public class RealPermissionProxy implements AbstractPermission{
    public void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    public void viewNoet() {

    }

    public void publishNote() {
        System.out.println("发布新内容");
    }

    public void modifyNote() {
        System.out.println("修改用户信息");

    }

    public void setLevel(int level) {


    }
}

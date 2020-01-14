package struct.proxy.first;

public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission=new PermissionProxy();
        permission.modifyNote();
        permission.modifyUserInfo();
        permission.publishNote();
        permission.setLevel(0);
        permission.viewNoet();

        System.out.println("-----------------------");

        permission.modifyUserInfo();
        permission.viewNoet();
        permission.setLevel(1);
        permission.modifyNote();
        permission.publishNote();
    }
}

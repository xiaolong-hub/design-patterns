package struct.proxy.proxypk;

public class PkClient {
    public static void main(String[] args) {
        PkAbstractPermission permission;
        permission = new PkRealPermissionProxy();
        permission.modifInfo();
        permission.setLevel(0);
        permission.modifNote();

        System.out.println("--------------");
        permission.setLevel(1);
        permission.modifNote();
        permission.modifInfo();
        permission.viewInfo();
    }
}

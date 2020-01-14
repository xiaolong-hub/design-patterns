package struct.proxy.first;

public class PermissionProxy implements AbstractPermission {
    private RealPermissionProxy realPermissionProxy = new RealPermissionProxy();
    private int leve = 0;

    //修改用户权限
    public void modifyUserInfo() {
        if (0 == leve) {
            System.out.println("sorry ,未授权");
        }else if (1==leve) {
            realPermissionProxy.modifyUserInfo();
        }
    }

    //查看用户帖子
    public void viewNoet() {
        System.out.println("您有权查看帖子,目前正在查看陈道明的帖子");

    }

    //发表评论的权限
    public void publishNote() {
        if (0 == leve) {
            System.out.println("sorry ,你没有发表评论观点的权限");
        } else if (1==leve ) {
            realPermissionProxy.publishNote();
        }

    }

    //修改个人信息的权限
    public void modifyNote() {
        if (0 == leve) {
            System.out.println("sorry,你无权修改评论信息,请先注册");

        } else if (1 == leve) {
            realPermissionProxy.modifyNote();
        }

    }

    //设置用户等级的权限
    public void setLevel(int level) {
        this.leve=level;
    }
}

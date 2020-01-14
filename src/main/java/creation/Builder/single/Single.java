package creation.Builder.single;

public class Single {
    /**
     * static所谓静态就是指在编译后所分配的内存会一直存在，直到程序退出内存才会释放这个空间，
     * 也就是只要程序在运行，那么这块内存就会一直存在,在Java程序里面，所有的东西都是对象，
     * 而对象的抽象就是类，对于一个类而言，如果要使用他的成员，那么普通情况下必须先实例化
     * 对象后，通过对象的引用才能够访问这些成员，但是用static修饰的成员可以通过类名加“.”进行直接访问
     */
    private static Single instance=null;

    public Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
            System.out.println("这是我第一次创建哟");
        } else {
            System.out.println("我只能实例化一次哟,刚刚已经被实例化啦");
        }

        return instance;
    }
}

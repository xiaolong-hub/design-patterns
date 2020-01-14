package beahavioral.observer.first;

public class Cat extends MySubject {
    @Override
    public void yell() {
        System.out.println("喵!喵!喵!");
        System.out.println("------------------");

        //当具体主题对象状态发生改变通知每一个具体的观察者
        for (Object obs : obs) {
            ((Observer)obs).response();
        }
    }
}

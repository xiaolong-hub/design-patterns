package beahavioral.observer.pk;

public class Client {
    public static void main(String[] args) {
        AbstractObserver obj1,obj2;
        //实例化一个具体的被观察的对象--死神
        AbstractSubject deathGod = new DeathGod();
        obj1=new HeathMen();
        obj2=new QuickDeathMen();
        deathGod.attach(obj1);
        deathGod.attach(obj2);

        deathGod.deathGodCome();

    }
}

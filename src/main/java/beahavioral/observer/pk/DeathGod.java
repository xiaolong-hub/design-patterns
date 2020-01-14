package beahavioral.observer.pk;

public class DeathGod extends AbstractSubject{
    @Override
    public void deathGodCome() {
        System.out.println("死神嫁到!!!!!!!!");
        System.out.println("-----------------");
        //通知所有观察死神的人
        for (Object obs:obsMen
             ) {
            ((AbstractObserver)obs).responsed();
        }
    }
}

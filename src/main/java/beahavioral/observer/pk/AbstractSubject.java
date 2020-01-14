package beahavioral.observer.pk;

import java.util.ArrayList;

public abstract class AbstractSubject {
    //保存所有观察死神的人
    protected ArrayList obsMen = new ArrayList();

    public void attach(AbstractObserver abstractObserver) {
        obsMen.add(abstractObserver);
    }

    public void detach(AbstractObserver abstractObserver) {
        obsMen.remove(abstractObserver);
    }

    public void deathGodCome() {

    }

}

package beahavioral.observer.first;

import java.util.ArrayList;

public abstract class MySubject {
    //用于保存所有观察者
    protected ArrayList obs = new ArrayList();

    //添加观察者者
    public void attach(Object myObserver) {
        obs.add(myObserver);

    }

    //移除观察者
    public void detach(Object myObserver) {
        obs.remove(myObserver);
    }

    public void yell() {

    }

}

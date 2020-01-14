package beahavioral.observer.second;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList obsAnimal = new ArrayList<Observer>();

    public void attach(Observer observer) {
        obsAnimal.add(observer);
    }

    public void detach(Observer observer) {

    }

    public void  yell() {

    }

}

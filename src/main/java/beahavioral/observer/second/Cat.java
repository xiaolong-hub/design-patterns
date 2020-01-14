package beahavioral.observer.second;

public class Cat extends Subject {
    @Override
    public void yell() {
        System.out.println("喵 喵 喵");
        for (Object obs :obsAnimal
             ) {
            ((Observer)obs).respose();
        }
    }
}

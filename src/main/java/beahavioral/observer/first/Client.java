package beahavioral.observer.first;

public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();
        Observer obj1, obj2, obj3;
        obj1 = new Dog();
        obj2 = new Mouse();

        subject.attach(obj1);
        subject.attach(obj2);

        subject.yell();
    }
}

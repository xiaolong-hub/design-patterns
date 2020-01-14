package beahavioral.observer.second;

public class Client {
    public static void main(String[] args) {
        Observer obj1, obj2;
        Subject subject=new Cat();
        obj1 = new Mouse();
        obj2=new Pig();

        subject.attach(obj1);
        subject.attach(obj2);
        subject.yell();
    }
}

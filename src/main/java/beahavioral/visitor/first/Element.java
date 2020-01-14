package beahavioral.visitor.first;

public abstract class Element {
    //元素接收的访问者
    public abstract void accept(Visitor visitor);
}

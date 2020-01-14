package beahavioral.visitor.second;

public abstract class SElement {
    //定义一个accept()方法,将SVisitor访问者作为方法参数传入,以便访问者访问元素
    public abstract void accept(SVisitor sVisitor);
}

package beahavioral.visitor.second;

public class SConVisitor1 extends SVisitor {
    //访问者1访问元素1和2
    @Override
    public void VisitSConElement1(SConElement1 sConElement1) {
        System.out.println("访问者:" + this.getClass().getSimpleName());
    }

    @Override
    public void VisitSConEloemen2(SConElement2 sConElement2) {
        System.out.println("访问者:" + this.getClass().getSimpleName());
    }
}

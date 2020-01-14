package beahavioral.state.first;

public class Context {
    //一个对象有很多种状态,主体对象与状态之间是聚合关系
    private State state;

    public Context(State state) {
        this.state = state;
    }


    /**
     * 用于对象状态之间的转换
     * @param state
     */

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态:"+state.getClass().getTypeName());
    }

    /**
     * 定义对象当前的一个状态
     */
    public void Resquest() {
        state.Handle(this);
    }
}

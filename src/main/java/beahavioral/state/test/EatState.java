package beahavioral.state.test;

public  class EatState extends State{

    @Override
    public void handle(ContextTest contextTe) {
        System.out.println("吃,吃,吃,吃");
        contextTe.setState(new SleepState());
    }
}


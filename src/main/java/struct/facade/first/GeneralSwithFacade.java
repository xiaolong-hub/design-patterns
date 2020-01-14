package struct.facade.first;

public class GeneralSwithFacade {
    private Lights[] lights = new Lights[4];
    private Fan fan;
    private AirCondition airCondition;
    private Television television;

    public GeneralSwithFacade() {
        lights[0] = new Lights("客厅");
        lights[1] = new Lights("卧室");
        lights[2] = new Lights("厕所");
        lights[3] = new Lights("厨房");
        fan=new Fan();
        airCondition = new AirCondition();
        television = new Television();

    }

    public void on() {
        for (Lights lts:lights
             ) {
            lts.on();

        }
        fan.on();
        television.on();
       airCondition.on();
    }

    public void off() {
        for (Lights li:lights
             ) {
            li.off();

        }
        fan.off();
        television.off();
        airCondition.off();
    }


}

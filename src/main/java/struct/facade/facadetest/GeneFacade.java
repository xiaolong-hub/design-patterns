package struct.facade.facadetest;

public class GeneFacade {
    private LightsTest[] lightsTest = new LightsTest[4];
    private FanTest fanTest;
    private AirConditiconTest airConditiconTest;
    private TeleveTest televeTest;

    public  GeneFacade() {
        fanTest = new FanTest();
        airConditiconTest = new AirConditiconTest();
        televeTest = new TeleveTest();
        lightsTest[0] = new LightsTest("客厅");
        lightsTest[1] = new LightsTest("厨房");
        lightsTest[2] = new LightsTest("卧室");
        lightsTest[3] = new LightsTest("卫生间");
    }

    public void on() {
        for (LightsTest lit:lightsTest
             ) {
            lit.on();
        }

        fanTest.on();
        televeTest.on();
        airConditiconTest.on();
    }

    public void off() {
        for (LightsTest lit:lightsTest
             ) {
            lit.off();
        }
        televeTest.off();
        airConditiconTest.off();
        fanTest.off();
    }

}

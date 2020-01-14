package struct.flyweight.flyweightTest;

import java.util.ArrayList;

public class DeviceFactoryTest {

    private int terminalNumber;
    private  ArrayList device = new ArrayList();

    public DeviceFactoryTest () {
        NetworkDeviceTest  switchTest= new SwitchTest("TCP");
        device.add(switchTest);
        NetworkDeviceTest hubTest = new HubTest("UDP");
        device.add(hubTest);

    }

    public NetworkDeviceTest  getNetworkDeviceTest(String type) {

        if (type.equalsIgnoreCase("TCP")) {
            terminalNumber++;
            return (NetworkDeviceTest) device.get(0);
        } else if (type.equalsIgnoreCase("UDP")) {
            terminalNumber++;
            return (HubTest) device.get(1);
        }
        return null;

    }

    public int getTotalDeviceTest() {
        return device.size();
    }
    public int getTerminalNumber() {
        return terminalNumber;
    }
}

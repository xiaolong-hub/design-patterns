package struct.flyweight.flyweightTest;

public class Client {
    public static void main(String[] args) {
        NetworkDeviceTest n1 ,n2,n3,n4;
        DeviceFactoryTest deviceFactoryTest = new DeviceFactoryTest();

        n1 = deviceFactoryTest.getNetworkDeviceTest("TCP");
        n1.use();

        n2 = deviceFactoryTest.getNetworkDeviceTest("UDP");
        n2.use();

        n3 = deviceFactoryTest.getNetworkDeviceTest("UDP");
        n3.use();

        n4 = deviceFactoryTest.getNetworkDeviceTest("UDP");
        n4.use();

        System.out.println("共享设备个数:" + deviceFactoryTest.getTerminalNumber());

    }
}

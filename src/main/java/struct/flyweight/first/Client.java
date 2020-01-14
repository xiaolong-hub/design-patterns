package struct.flyweight.first;

public class Client {

    public static void main(String[] args) {
        NetWorkDevice n1,n2,n3,n4,n5;
        DeviceFactory deviceFactory = new DeviceFactory();

        n1 = deviceFactory.getNetWorkDevice("TCP");
        n1.use();
        n2 = deviceFactory.getNetWorkDevice("UDP");
        n2.use();
        n3 = deviceFactory.getNetWorkDevice("TCP");
        n3.use();
    }
}

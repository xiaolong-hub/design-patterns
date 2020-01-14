package struct.flyweight.flyweightself;

public class Client {
    public static void main(String[] args) {
        NetWorkDeviceSelf n1, n2, n3,n4;
        DeviceFactorySelf deviceFactorySelf = new DeviceFactorySelf();
        n1 = deviceFactorySelf.getNetWorkDeviceSelf("TCP");
        n1.use();
        n2 = deviceFactorySelf.getNetWorkDeviceSelf("UDP");
        n2.use();
        n3 = deviceFactorySelf.getNetWorkDeviceSelf("TCP");
        n3.use();
        n4 = deviceFactorySelf.getNetWorkDeviceSelf("TCP");
        n4.use();


        System.out.println("总共用于共享的对象:" + deviceFactorySelf.getTotalDevice());
        System.out.println("有多少个终端调用共享的对象"+deviceFactorySelf.getTotalNumber());
    }
}

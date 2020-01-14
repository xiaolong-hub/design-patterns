package struct.flyweight.flyweightself;

import java.util.ArrayList;

public class DeviceFactorySelf {

    private ArrayList device = new ArrayList();
    private int totalNumber;
     NetWorkDeviceSelf n1,n2,n3, n4;

    private int totalTimes;
    private String Type;


    public DeviceFactorySelf() {
        n1=new SwitchSelf("TCP");
        device.add(n1);
        n2=new HubSelf("UDP");
        device.add(n2);
    }

    public NetWorkDeviceSelf getNetWorkDeviceSelf(String type) {
        if (type.equalsIgnoreCase("TCP")) {
            totalNumber++;
            return (NetWorkDeviceSelf) device.get(0);
        } else if (type.equalsIgnoreCase("UDP")) {
            totalNumber++;
            return (NetWorkDeviceSelf) device.get(1);

        }
        return null;
    }
    public int getTotalDevice() {
        //返回用于共享的对象个数
        return device.size();
    }
    public int getTotalNumber() {
        return totalNumber;
    }
}

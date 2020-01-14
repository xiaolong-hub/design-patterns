package struct.flyweight.first;

import java.util.ArrayList;

public class DeviceFactory {
    //将要分享的对象存入ArrayList数组中
    private ArrayList devices = new ArrayList();
    /*记录有多少台设备共享了硬件设备*/
    private int  totalTerminal=0;


    /*工厂中的内容就是用于共享的硬件设备*/
    public DeviceFactory() {
        NetWorkDevice netWorkDevice = new Switch("TCP");
        devices.add(netWorkDevice);

        NetWorkDevice netWorkDevice1 = new Hub("UDP");
        devices.add(netWorkDevice1);
    }

    /**
     * 外部获取硬件设备的方法
     * @param type
     * @return
     */
    public NetWorkDevice getNetWorkDevice(String type) {
        if (type.equalsIgnoreCase("TCP")) {
            /**
             * 当TCP被调用,别调用次数自增1
             */

            totalTerminal++;
            return (NetWorkDevice) devices.get(0);
        } else if (type.equalsIgnoreCase("UDP")) {
            totalTerminal++;
            return (NetWorkDevice) devices.get(0);
        } else {
            return null;
        }
    }


}

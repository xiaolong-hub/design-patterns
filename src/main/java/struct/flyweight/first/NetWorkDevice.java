package struct.flyweight.first;

public interface NetWorkDevice {
    /**
     * 用于获取共享的设备所属类型
     * @return
     */
    public String getType();

    /**
     外部调用是调用这个方法
     */
    public void use();

}

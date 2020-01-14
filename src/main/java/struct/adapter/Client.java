package struct.adapter;

public class Client {
    public static void main(String[] args) {
        //适配器
        DogAdapter dogAdapter;
        //要被适配的对象
        Robbot robbot = new DogAdapter();
        //开始使用被适配类的对象方法
        robbot.go();
        robbot.speak();
    }
}

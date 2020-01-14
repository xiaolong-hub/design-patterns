package beahavioral.iterator.second;

public class Client {
    public static void display(AbsTelevision tv) {
        InterTvIterator i = tv.createTvIterator();
        System.out.println("电视频道:");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(AbsTelevision tv) {
        InterTvIterator i = tv.createTvIterator();
        System.out.println("反向打印电视频道:");
        i.setChannel(3);
        while (!i.isFirst()) {
            System.out.println(i.currentChannel().toString());
            i.previous();
        }
    }
    public static void main(String[] args) {
        AbsTelevision tv;
        tv=new MDTV();
        display(tv);

    }
}

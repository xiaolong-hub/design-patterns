package beahavioral.iterator.first;

public class Client {
    public static void display(Television tv) {
        TvIterator i = tv.createIterator();
        System.out.println("电视机频道:");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisPlay(Television tv) {
        //创建一个电视遥控器,用于迭代电视频道
        TvIterator i = tv.createIterator();
        //设置当前但是频道为3频道
        i.setChannel(3);
        //当但是频道不是第一个时从后往前更换频道
        while (!i.isFirst()) {
            //从后往前更换电视频道
            i.previous();
        }

    }

    public static void main(String[] args) {

        Television television;
        television = new SkyworthTelevision();
        television=new TCLTelevision();

        display(television);

    }
}

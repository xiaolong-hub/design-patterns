package beahavioral.iterator.test;

import javax.swing.*;

public class Client {
    public static void disPlay(TVAbastract tv) {
        PKIterator pkIterator = tv.createHaiIterator();
        while (!pkIterator.isFirst()) {
            System.out.println("电视频道:");
            System.out.println(pkIterator.getClass().toString());
            pkIterator.next();
        }
    }

    public static void main(String[] args) {
        TVAbastract tvAbastract;
        tvAbastract=new HaiTV();
        disPlay(tvAbastract);
    }
}

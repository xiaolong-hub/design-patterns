package beahavioral.iterator.second;

public interface InterTvIterator {
    //从第一个频道依次往后更换电视频道
    void next();

    //从最后一个频道依次向前更换电视频道
    void previous();

    boolean isFirst();

    boolean isLast();

    //设置当前电视的频道,用于向前或向后更换电视频道的
    Object setChannel(int i);


    Object currentChannel() ;



}

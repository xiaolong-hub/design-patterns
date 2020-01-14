package beahavioral.iterator.first;

public interface TvIterator {
    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    boolean isFirst();

    Object currentChannel();

}

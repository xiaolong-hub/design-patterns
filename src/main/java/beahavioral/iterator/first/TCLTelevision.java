package beahavioral.iterator.first;

public class TCLTelevision implements Television {
    @Override
    public TvIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TvIterator {
        private Object[] TclChannel = {"湖南卫视", "天津卫视", "北京卫视", "海南卫视"};
        private int TCLChannelIndex = 0;

        @Override
        public void setChannel(int i) {
            TCLChannelIndex = i;
        }

        @Override
        public void next() {
            if (TCLChannelIndex <TclChannel.length) {
                TCLChannelIndex++;
            }
        }

        @Override
        public void previous() {
            if (TCLChannelIndex > 0) {
                TCLChannelIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return TCLChannelIndex==TclChannel.length;
        }

        @Override
        public boolean isFirst() {
            return TCLChannelIndex==0;
        }

        @Override
        public Object currentChannel() {
            return TclChannel[TCLChannelIndex];
        }
    }

}

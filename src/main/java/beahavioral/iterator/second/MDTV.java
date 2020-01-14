package beahavioral.iterator.second;

import java.nio.channels.Channel;

public class MDTV implements AbsTelevision {
    @Override
    public InterTvIterator createTvIterator() {
        return new MDTVIterator();
    }

    private class MDTVIterator implements InterTvIterator {
        //MD(美的电视机的电视频道)
        private Object[] MDChannel = {"北京卫视", "四川卫视", "青海卫视", "陕西卫视", "深圳卫视"};
        //电视频道标号
        private  int MDChannelIndex=0;

        @Override
        public void next() {
            if (MDChannelIndex < MDChannel.length) {
                MDChannelIndex++;
            }
        }

        @Override
        public void previous() {
            if (MDChannelIndex >0) {
                MDChannelIndex--;
            }
        }

        @Override
        public boolean isFirst() {
           return MDChannelIndex == 0;
        }

        //返回最后一个电视频道编号,数组的长度就是最后一个电视频道
        @Override
        public boolean isLast() {
            return MDChannelIndex == MDChannel.length;
        }

        @Override
        public Object setChannel(int i) {
            return MDChannelIndex = i;
        }

        //返回当前的电视频道
        @Override
        public Object currentChannel() {
            return MDChannel[MDChannelIndex];
        }
    }


}

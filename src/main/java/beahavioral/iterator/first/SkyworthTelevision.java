package beahavioral.iterator.first;

public class SkyworthTelevision implements Television {
    private Object[] channel = {"cctv-1", "cctv-2", "cctv-3", "cctv-4"};


    /**
     * 创建一个创维电视的遥控器对象用于遍历创维电视的电视频道
     * @return
     */
    @Override
    public TvIterator createIterator() {
        return new SkyworthIterator();
    }

    /**
     * 创维迭代器作为创维电视的内类用于遍历创维电视的电视频道
     */
    private class SkyworthIterator implements TvIterator {
        private int currentIndex=0;

        //设置一个电视频道
        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        //下一个频道
        @Override
        public void next() {
            if (currentIndex < channel.length) {
                currentIndex++;
            }
        }

        //上一个频道
        @Override
        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
        }

        //展示最后一个频道
        @Override
        public boolean isLast() {
            return currentIndex==channel.length;
        }

        //展示第一个电视频道
        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }

        //展示当前的电视频道
        @Override
        public Object currentChannel() {
            return channel[currentIndex];
        }

    }


}

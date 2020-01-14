package beahavioral.iterator.test;

public class HaiTV implements TVAbastract{
    @Override
    public PKIterator createHaiIterator() {
        return new HaiTVItertor();
    }

    private class HaiTVItertor implements PKIterator {
        private Object[] HaiChannel = {"cctv1", "cctv2", "cctv3", "cctv4"};
        private int HaiChannelIndex = 0;

        @Override
        public boolean isFirst() {
            return HaiChannelIndex == 0;
        }

        @Override
        public boolean isLast() {
            return HaiChannelIndex == HaiChannel.length;
        }

        @Override
        public void next() {
            if (HaiChannelIndex < HaiChannel.length) {
                HaiChannelIndex++;
            }
        }


        @Override
        public void privious() {
            if (HaiChannelIndex > 0) {
                HaiChannelIndex--;
            }
        }

        @Override
        public Object setChannel(int i) {
            return HaiChannelIndex == i;
        }

        @Override
        public Object currentChannel() {
            return null;

        }

    }

}

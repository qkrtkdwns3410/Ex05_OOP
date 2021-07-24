package default11;

public class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel; //이전 채널(previous Channel)

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;


    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL|| channel<MIN_CHANNEL) {
            return;
        }
        this.channel = channel;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME|| volume<MIN_VOLUME) {
            return;
        }
        this.
        this.volume = volume;
    }

    public void gotoPrevChannel() {


    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

}


























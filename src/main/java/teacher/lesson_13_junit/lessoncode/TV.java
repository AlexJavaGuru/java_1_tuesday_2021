package teacher.lesson_13_junit.lessoncode;

class TV {

    private static final int MAX_CHANNEL = 5;
    private static final int MIN_CHANNEL = 0;

    private boolean turnedOn;
    private int volume;
    private int channel;

    public TV(boolean turnedOn, int volume, int channel) {
        this.turnedOn = turnedOn;
        this.volume = volume;
        this.channel = channel;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    void increaseVolume() {
        if (!turnedOn) {
            throw new IllegalStateException("TV turned off.");
        }
        if (volume < 99) {
            volume++;
        }
    }

    void decreaseVolume() {
        if (!turnedOn) {
            throw new IllegalStateException("TV turned off.");
        }
        if (volume > 0) {
            volume--;
        }

    }

    void changeChannel(int channel) {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
            throw new InvalidChannelException("Incorrect channel: " + channel + ". Channel min value: " + MIN_CHANNEL + ", max value: " + MAX_CHANNEL);
        }
        if (!turnedOn) {
            turnedOn = true;
        }
        this.channel = channel;
    }

    void turnOn() {
        if (turnedOn) {
            throw new IllegalStateException("TV already turned on.");
        }
        turnedOn = true;
    }

    void turnOff() {
        if (!turnedOn) {
            throw new IllegalStateException("TV already turned off.");
        }
        turnedOn = false;
    }
}

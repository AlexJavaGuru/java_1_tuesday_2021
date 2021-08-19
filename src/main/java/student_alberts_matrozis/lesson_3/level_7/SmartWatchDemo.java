package student_alberts_matrozis.lesson_3.level_7;

public class SmartWatchDemo {
    public static void main(String[] args) {
        SmartWatch appleWatch = new SmartWatch("Apple Watch SE 40mm", "WatchOS 8", 4);
        appleWatch.aboutDevice();
        appleWatch.connectToDevice();
    }
}

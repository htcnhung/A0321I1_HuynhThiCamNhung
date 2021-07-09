package _4_class_and_object_in_java.bai_tap;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch x = new StopWatch();
        x.start();
        int a = 0;
        for (int i = 0; i < 2000000000; i++) {
            a += 1;
        }
        x.end();
        x.getEndTime();
        x.getStartTime();
        System.out.println(x.getElapsedTime());

    }

    public long startTime;
    public long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

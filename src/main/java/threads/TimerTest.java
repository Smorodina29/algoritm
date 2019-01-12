package threads;

import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();

        timer.schedule(myTimerTask, 1000, 500);
        Thread.sleep(500);
        timer.cancel();
    }
}

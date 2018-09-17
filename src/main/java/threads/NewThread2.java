package threads;

public class NewThread2 implements Runnable {
        String name; // имя потока исполнения
        Thread t;
        boolean suspendFlag;
        NewThread2(String threadname) {
            name = threadname;
            t = new Thread(this, name);
            System.out.println("Hoвый поток: " + t);
            suspendFlag = false;
            t.start();
        }
        @Override
        public void run () {
            try {
                for (int i = 15; i > 0; i--) {
                    System.out.println(name + "· " + i);
                    Thread.sleep(200);
                    synchronized (this) {
                    }
                    while (suspendFlag) {
                        wait();
                    }
                }
            } catch (InterruptedException е) {
                System.out.println(name + " прерван.");
            }
                System.out.println(name + "завершен.");
        }

        synchronized void mysuspend() {
            suspendFlag = true;
        }
        synchronized void myresume () {
            suspendFlag = false;
            notify();
        }
}
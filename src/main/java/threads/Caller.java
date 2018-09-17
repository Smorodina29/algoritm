package threads;

public class Caller implements Runnable {
        String msg;
        final Callme target;
        Thread t;

        public Caller(Callme targ, String s) {
            msg = s;
            target = targ;
            t = new Thread(this);
            System.out.println("New Thread" + t + ", msg=");
            t.start();
        }

        @Override
        public void run() {
            synchronized(target){
                target.call(msg);
            }
        }
}

package threads;

public class Tr{
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        MyRunnable myRunnable3 = new MyRunnable();
        myRunnable1.run();
        myRunnable2.run();
        myRunnable3.run();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());


        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("new");
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
    }

    private static class MyRunnable implements Runnable{
        private Thread t;

        public MyRunnable() {
            t = new Thread();
            t.start();
        }

        @Override
        public void run() {
            Thread.currentThread().setName("new");
            System.out.println(Thread.currentThread().getName());
            for (int i=0; i<5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

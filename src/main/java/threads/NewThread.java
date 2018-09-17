package threads;

public class NewThread implements Runnable {
    String name;
    Thread t;

    public NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New tread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i=5; i>0; i--) {
                System.out.println(name + " : " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " stop");
        }
        System.out.println(name + " end");
    }
}

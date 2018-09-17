package threads;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 =  new NewThread ("Один" );
        NewThread ob2 = new NewThread("Двa");
        NewThread ob3 = new NewThread("Tpи" );

        System.out.println("Thread1 is runner " + ob1.t.isAlive());
        System.out.println("Thread2 is runner " + ob2.t.isAlive());
        System.out.println("Thread3 is runner " + ob3.t.isAlive());

        try {
            System.out.println("Wait");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is stopped");
        }

        System.out.println("Thread1 is runner " + ob1.t.isAlive());
        System.out.println("Thread2 is runner " + ob2.t.isAlive());
        System.out.println("Thread3 is runner " + ob3.t.isAlive());

        System.out.println("Main thread is end");
    }
}

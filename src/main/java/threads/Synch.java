package threads;
class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller t1 = new Caller(target, "1");
        Caller t2 = new Caller(target, "2");
        Caller t3 = new Caller(target, "3");

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException е) {
            System.out.println("Пpepвaнo");
        }
    }
}

package threads;

public class Callme {
      void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException е) {
            System.out.println("Пpepвaнo");
        }
            System.out.println("]");
        }
    }

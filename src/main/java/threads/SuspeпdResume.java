package threads;

public class SuspeпdResume {
    public static void main(String args[]) {
        NewThread2 ob1 = new NewThread2("Один");
        NewThread2 ob2 = new NewThread2("Двa");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Boзoбнoвлeниe потока Один");
            ob2.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }

        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}

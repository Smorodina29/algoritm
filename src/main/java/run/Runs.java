package run;

import java.io.IOException;

public class Runs {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Всего памыти "+r.totalMemory());
        System.out.println("Всего свободной памыти " + r.freeMemory());
        System.out.println(System.getProperty("java.version"));

        int i = 5;
        System.out.println(Integer.toOctalString(i));

        System.out.println(System.getSecurityManager());
        System.exit(0);
        r.gc();
        System.out.println("Памяти после очистки " +r.freeMemory());

        /*Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor();
        } catch (IOException e) {
            System.out.println("Ошбика запуска");
        } catch (InterruptedException e) {
            System.out.println("Notepad error wait");
        }*/

        /*ProcessBuilder pb = new ProcessBuilder("notepad.exe", "testfile");
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

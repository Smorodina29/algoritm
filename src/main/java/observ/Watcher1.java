package observ;

import java.util.Observable;
import java.util.Observer;

public class Watcher1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Метод update() вызван, отсчет count равен " + ((Integer) arg).intValue());
    }
}

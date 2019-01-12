package observ;

import java.util.Observable;

public class BeingWatched extends Observable {
    void countar(int period){
        for (; period>=0; period--){
            setChanged();
            notifyObservers(new Integer(period));
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Ожидание прервано");
            }
        }
    }
}

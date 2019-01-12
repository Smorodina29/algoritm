package observ;

public class TwoObservers {
    public static void main(String[] args) {
        Watcher1 watcher1 = new Watcher1();
        Watcher2 watcher2 = new Watcher2();

        BeingWatched observed = new BeingWatched();
        observed.addObserver(watcher1);
        observed.addObserver(watcher2);
        observed.countar(10);
    }
}

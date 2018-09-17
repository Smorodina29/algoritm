package patterns.singletons;

public class Singleton1 {
    private static volatile Singleton1 instance;

    private Singleton1() {

    }
    public static Singleton1 getInstance() {
        Singleton1 localInstance = instance;
        if (localInstance == null){
            synchronized (Singleton1.class){
                localInstance = instance;
                if (localInstance == null){
                    localInstance = instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}

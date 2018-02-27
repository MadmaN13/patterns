package singleton.syncronized.doublecheck;

public class Singleton {
    private Singleton() {};
    private volatile static Singleton instance;

    private static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

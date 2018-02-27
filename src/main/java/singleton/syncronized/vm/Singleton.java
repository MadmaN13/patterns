package singleton.syncronized.vm;

public class Singleton {
    private Singleton() {};
    private static Singleton instance = new Singleton();

    private static Singleton getInstance() {
        return instance;
    }
}

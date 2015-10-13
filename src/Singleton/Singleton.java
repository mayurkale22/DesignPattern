package Singleton;

/**
 * Created by mayurkale on 9/30/15.
 * Upside : load singleton lazily, Downside: This is not thread-safe
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() { // db connection code
    }
    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
    public String getDesciption() {
        return "I'm a Singleton Class";
    }
}

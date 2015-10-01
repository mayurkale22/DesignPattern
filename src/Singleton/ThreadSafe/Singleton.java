package Singleton.ThreadSafe;

/**
 * Created by mayurkale on 9/30/15.
 * Upside: Thread safe and lazy load
 * Downside: synchronized code takes lots of time to run, also blocker for other thread.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
    public String getDesciption() {
        return "I'm a Singleton Class";
    }
}

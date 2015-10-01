package Singleton.ThreadSafeEarly;

/**
 * Upside : Thread safe
 * Downside: we are loading or creating singleton instance early. It might not be used in program.
 * It will also slow down JVM
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return uniqueInstance;
    }
    public String getDesciption() {
        return "I'm a Singleton Class";
    }
}

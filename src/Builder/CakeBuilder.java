package Builder;

/**
 * Created by mayurkale on 10/3/15.
 */
public class CakeBuilder {
    public static void main(String[] args) {
        Cake whiteCake = new Cake.Builder().sugar(1).milk(1).butter(2).build();

        System.out.println("c = " + whiteCake);
    }
}

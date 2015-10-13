package Decorator;

/**
 * Created by mayurkale on 9/30/15.
 */
public class main {

    public static void main(String[] args) {
        Beverage beverage1 = new Expresso();
        System.out.println(beverage1.getDescription() + " " +  beverage1.cost());

        //Beverage beverage1 = new Expresso();
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + " " +  beverage1.cost());
        beverage1 = new Cream(beverage1);
        System.out.println(beverage1.getDescription() + " " +  beverage1.cost());

    }
}

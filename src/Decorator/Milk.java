package Decorator;

/**
 * Created by mayurkale on 9/30/15.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}

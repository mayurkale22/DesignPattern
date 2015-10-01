package Decorator;

/**
 * Created by mayurkale on 9/30/15.
 */
public class Cream extends CondimentDecorator {
    Beverage beverage;

    Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}

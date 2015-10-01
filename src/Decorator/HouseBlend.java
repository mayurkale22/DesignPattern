package Decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

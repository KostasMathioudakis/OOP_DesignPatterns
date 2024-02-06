package DecoratorPattern;

public class Mocha extends CondimentDecorator{

    // Instance variable to hold the beverage we are wrapping
    Beverage beverage;

    // Pass the beverage we are wrapping to the decorator's constructor
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return .20 + beverage.cost();
    }
}

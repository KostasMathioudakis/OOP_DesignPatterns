package DecoratorPattern;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast coffee";
    }
    public double cost(){
        return .99;
    }
}

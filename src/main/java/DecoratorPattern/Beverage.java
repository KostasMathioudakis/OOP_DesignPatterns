package DecoratorPattern;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    // cost will be implemented in the subclasses
    public abstract  double cost();
}

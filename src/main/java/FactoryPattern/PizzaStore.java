package FactoryPattern;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    /*
    Now we have moved our factory object to this method. Our factory method is now abstract in PizzaStore
    and each subclass of pizzastore will have to implement it.
     */
    abstract Pizza createPizza(String type);
}

package FactoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

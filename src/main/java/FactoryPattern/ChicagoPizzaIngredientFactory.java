package FactoryPattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    Dough createDough(){
        return new ThickCrustDough();
    }

    Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    Cheese createCheese(){
        return new Mozzarella();
    }

    Veggies[] createVeggies(){
        Veggies[] veggies = {new Eggplant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    Clams createClam(){
        return new FrozenClams();
    }
}

package FactoryPattern;

//public class SimplePizzaFactory {
//    /*
//        static:
//        We can use a static method instead since we dont need to instantiate an object to make use of the create
//        method. But that will have the disadvantage that we wont be able to subclass and change the behavior
//        of the create method.
//     */
//    public Pizza createPizza(String type){
//        Pizza pizza = null;
//        if (type.equals("cheese")){
//            pizza = new CheesePizza();
//        }
//        else if (type.equals("pepperoni")){
//            pizza = new PepperoniPizza();
//        }
//        else if (type.equals("clam")){
//            pizza = new ClamPizza();
//        }
//        else if (type.equals("veggie")){
//            pizza = new VeggiePizza();
//        }
//        return pizza;
//    }
//}

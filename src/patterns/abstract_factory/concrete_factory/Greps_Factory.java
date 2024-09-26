package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Fruit_Type;
import patterns.abstract_factory.abstract_product.Fruit;
import patterns.abstract_factory.concrete_product.Greps;

public class Greps_Factory implements Fruit_Type {
    @Override
    public Fruit creatFruit() {
        Greps myFruit =  new Greps();
        myFruit.setType("Greps");

        return myFruit;
    }
}

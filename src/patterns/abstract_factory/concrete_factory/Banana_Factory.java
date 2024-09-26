package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Fruit_Type;
import patterns.abstract_factory.abstract_product.Fruit;
import patterns.abstract_factory.concrete_product.Banana;

public class Banana_Factory implements Fruit_Type {
    @Override
    public Fruit creatFruit() {
        Banana myFruit =  new Banana();
        myFruit.setType("Banana");

        return myFruit;
    }
}

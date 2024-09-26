package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Fruit_Type;
import patterns.abstract_factory.abstract_product.Fruit;
import patterns.abstract_factory.concrete_product.Apple;

public class Apple_Factory implements Fruit_Type {
    @Override
    public Fruit creatFruit() {
        Apple myFruit =  new Apple();
        myFruit.setType("Apple");

        return myFruit;
    }
}

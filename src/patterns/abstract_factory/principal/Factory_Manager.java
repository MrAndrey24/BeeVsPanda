package patterns.abstract_factory.principal;

import patterns.abstract_factory.abstract_factory.Fruit_Type;
import patterns.abstract_factory.abstract_product.Fruit;
import patterns.abstract_factory.concrete_factory.Apple_Factory;
import patterns.abstract_factory.concrete_factory.Banana_Factory;
import patterns.abstract_factory.concrete_factory.Greps_Factory;

public class Factory_Manager {

    public static String createFruitFactory(Fruit_Type pFactory) {
        Fruit objF= pFactory.creatFruit();
        return objF.fruitType();
    }

    public static String processFunction(int pOpc) {
        Fruit_Type fruit;
        switch (pOpc) {
            case 1:
                fruit = new Banana_Factory();
                break;
            case 2:
                fruit = new Apple_Factory();
                break;
            case 3:
                fruit = new Greps_Factory();
                break;
            default:
                return "";
        }
        return createFruitFactory(fruit);
    }
}

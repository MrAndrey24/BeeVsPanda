package patterns.abstract_factory.concrete_product;

import patterns.abstract_factory.abstract_product.Fruit;

public class Apple implements Fruit {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String fruitType() {
        return getType();
    }
}

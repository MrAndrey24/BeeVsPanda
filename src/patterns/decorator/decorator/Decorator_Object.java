package patterns.decorator.decorator;

import patterns.decorator.component.Bee;

public abstract class Decorator_Object extends Bee {
    public Bee bee;

    public Decorator_Object(String fruit, Bee bee) {
        setFruit(fruit);
        this.bee = bee;
    }

    public Decorator_Object(Bee bee) {
        this.bee = bee;
    }
}

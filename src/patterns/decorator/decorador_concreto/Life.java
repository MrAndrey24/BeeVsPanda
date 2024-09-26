package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Bee;
import patterns.decorator.decorator.Decorator_Object;

public class Life extends Decorator_Object {

    public Life(Bee bee) {
        super(bee);
    }

    @Override
    public String assignPowerUp() {
        return bee.getFruit();
    }
}

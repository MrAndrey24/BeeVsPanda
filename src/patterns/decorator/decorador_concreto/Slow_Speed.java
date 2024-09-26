package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Bee;
import patterns.decorator.decorator.Decorator_Object;

public class Slow_Speed extends Decorator_Object {

    public Slow_Speed(Bee bee) {
        super(bee);
    }

    @Override
    public String assignPowerUp() {
        return bee.getFruit();
    }
}

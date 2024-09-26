package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Bee;
import patterns.decorator.decorator.Decorator_Object;

public class Hight_Speed extends Decorator_Object {
    public Hight_Speed(Bee bee) {
        super(bee);
    }

    @Override
    public String assignPowerUp() {
        return bee.getFruit();
    }
}

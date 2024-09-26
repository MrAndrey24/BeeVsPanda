package patterns.decorator.concrete_component;

import patterns.decorator.component.Bee;

public class Bee_Power extends Bee {

    public Bee_Power(String power) {
        super(power);
    }

    @Override
    public String assignPowerUp() {
        return getFruit();
    }
}

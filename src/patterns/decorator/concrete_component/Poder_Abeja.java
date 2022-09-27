package patterns.decorator.concrete_component;

import patterns.decorator.component.Abeja;

public class Poder_Abeja extends Abeja {

    public Poder_Abeja(String poder) {
        super(poder);
    }

    @Override
    public String asignarPowerUp() {
        return getFruta();
    }
}

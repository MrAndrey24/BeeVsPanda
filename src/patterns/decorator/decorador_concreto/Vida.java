package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Abeja;
import patterns.decorator.decorator.Objeto_Decorado;

public class Vida extends Objeto_Decorado {

    public Vida(Abeja abeja) {
        super(abeja);
    }

    @Override
    public String asignarPowerUp() {
        return abeja.getFruta();
    }
}

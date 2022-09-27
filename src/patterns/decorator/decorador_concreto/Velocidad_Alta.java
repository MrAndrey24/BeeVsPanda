package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Abeja;
import patterns.decorator.decorator.Objeto_Decorado;

public class Velocidad_Alta extends Objeto_Decorado {
    public Velocidad_Alta(Abeja abeja) {
        super(abeja);
    }

    @Override
    public String asignarPowerUp() {
        return abeja.getFruta();
    }
}

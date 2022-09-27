package patterns.decorator.decorador_concreto;

import patterns.decorator.component.Abeja;
import patterns.decorator.decorator.Objeto_Decorado;

public class Velocidad_Baja extends Objeto_Decorado {

    public Velocidad_Baja(Abeja abeja) {
        super(abeja);
    }

    @Override
    public String asignarPowerUp() {
        return abeja.getFruta();
    }
}

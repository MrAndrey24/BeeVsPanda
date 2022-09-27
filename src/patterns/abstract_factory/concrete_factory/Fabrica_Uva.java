package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Tipo_Fruta;
import patterns.abstract_factory.abstract_product.Fruta;
import patterns.abstract_factory.concrete_product.Uva;

public class Fabrica_Uva implements Tipo_Fruta {
    @Override
    public Fruta crearFruta() {
        Uva miFruta =  new Uva();
        miFruta.setTipo("Uva");

        return miFruta;
    }
}

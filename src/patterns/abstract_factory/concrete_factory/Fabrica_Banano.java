package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Tipo_Fruta;
import patterns.abstract_factory.abstract_product.Fruta;
import patterns.abstract_factory.concrete_product.Banano;

public class Fabrica_Banano implements Tipo_Fruta {
    @Override
    public Fruta crearFruta() {
        Banano miFruta =  new Banano();
        miFruta.setTipo("Banano");

        return miFruta;
    }
}

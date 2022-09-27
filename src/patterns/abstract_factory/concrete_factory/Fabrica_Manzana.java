package patterns.abstract_factory.concrete_factory;

import patterns.abstract_factory.abstract_factory.Tipo_Fruta;
import patterns.abstract_factory.abstract_product.Fruta;
import patterns.abstract_factory.concrete_product.Manzana;

public class Fabrica_Manzana implements Tipo_Fruta {
    @Override
    public Fruta crearFruta() {
        Manzana miFruta =  new Manzana();
        miFruta.setTipo("Manzana");

        return miFruta;
    }
}

package patterns.abstract_factory.principal;

import patterns.abstract_factory.abstract_factory.Tipo_Fruta;
import patterns.abstract_factory.concrete_factory.Fabrica_Banano;
import patterns.abstract_factory.concrete_factory.Fabrica_Manzana;
import patterns.abstract_factory.concrete_factory.Fabrica_Uva;
import patterns.abstract_factory.abstract_product.Fruta;

public class Gestor_Fabrica {

    public static String crearFabricaDeFrutas(Tipo_Fruta pFabrica) {
        Fruta objF= pFabrica.crearFruta();
        return objF.tipoFruta();
    }

    public static String procesarFuncion(int pOpc) {
        String sMensaje ="";
        Tipo_Fruta frut;
        switch (pOpc) {

            case 1:
                frut  = new Fabrica_Banano();
                sMensaje = crearFabricaDeFrutas(frut);
                break;

            case 2:
                frut  = new Fabrica_Manzana();
                sMensaje = crearFabricaDeFrutas(frut);
                break;

            case 3:
                frut  = new Fabrica_Uva();
                sMensaje = crearFabricaDeFrutas(frut);
                break;

            default:
                sMensaje = "";
                break;
        }
        return sMensaje ;
    }
}

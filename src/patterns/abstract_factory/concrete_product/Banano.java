package patterns.abstract_factory.concrete_product;

import patterns.abstract_factory.abstract_product.Fruta;

public class Banano implements Fruta {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String tipoFruta() {
        return getTipo();
    }
}

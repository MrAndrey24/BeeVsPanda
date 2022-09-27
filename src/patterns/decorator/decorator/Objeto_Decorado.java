package patterns.decorator.decorator;

import patterns.decorator.component.Abeja;

public abstract class Objeto_Decorado extends Abeja{
    public Abeja abeja;

    public Objeto_Decorado(String fruta, Abeja abeja) {
        setFruta(fruta);
        this.abeja = abeja;
    }

    public Objeto_Decorado(Abeja abeja) {
        this.abeja = abeja;
    }
}

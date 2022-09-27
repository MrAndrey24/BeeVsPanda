package patterns.decorator.component;

public abstract class Abeja {
    private String fruta;

    public Abeja() {
    }

    public Abeja(String fruta) {
        this.fruta = fruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public abstract String asignarPowerUp();
}

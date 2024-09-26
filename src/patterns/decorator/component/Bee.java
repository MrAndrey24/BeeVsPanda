package patterns.decorator.component;

public abstract class Bee {
    private String fruit;

    public Bee() {
    }

    public Bee(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public abstract String assignPowerUp();
}

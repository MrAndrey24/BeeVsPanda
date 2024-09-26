package patterns.decorator.principal;

import patterns.decorator.component.Bee;
import patterns.decorator.concrete_component.Bee_Power;
import patterns.decorator.decorador_concreto.Hight_Speed;
import patterns.decorator.decorador_concreto.Slow_Speed;
import patterns.decorator.decorador_concreto.Life;

public class Decorator_Manager {

    public String typeFruit(String type) {
        Bee myBee = null;
        switch(type) {
            case "Banana":
                myBee = new Bee_Power("Life");
                new Life(myBee);
                break;

            case "Apple":
                myBee = new Bee_Power("Hight");
                new Hight_Speed(myBee);
                break;

            case "Uva":
                myBee = new Bee_Power("Slow");
                new Slow_Speed(myBee);
                break;
        }
        return myBee.getFruit();
    }
}

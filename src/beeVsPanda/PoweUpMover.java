package beeVsPanda;

import java.awt.*;

public class PoweUpMover extends Thread {
    private Shooter shooter;
    private PowerUps powerUps;
    private GameBoard gb;

    public PoweUpMover(PowerUps powerUps, GameBoard gb, Shooter shooter) {
        this.shooter = shooter;
        this.gb = gb;
        this.powerUps = powerUps;
    }

    public void run() {

        while (powerUps.getX() > -100) {
            powerUps.setX(powerUps.getX() - 1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            gb.repaint();

            checkCollision();
        }
        powerUps.setX(1100);    //setting getX again to 1100
        run();    //starting from the beginning
    }

    public void checkCollision() {

        Rectangle shooterRect = new Rectangle(shooter.getX(), shooter.getY(), 105, 120);

        boolean isHit = false;

        Rectangle beeRect = new Rectangle(powerUps.getX(), powerUps.getY(), 70, 60); //105 because it'll be nearer when colliding

        if (shooterRect.intersects(beeRect) == true) {
            isHit = true;

            String decorador = "";
            if (powerUps.getImagePath().equals("images//Frutas//1.png"))
                decorador = gb.gestorDecorador.tipoFruta("Manzana");
            if (powerUps.getImagePath().equals("images//Frutas//2.png"))
                decorador = gb.gestorDecorador.tipoFruta("Banano");
            if (powerUps.getImagePath().equals("images//Frutas//3.png"))
                decorador = gb.gestorDecorador.tipoFruta("Uva");

            switch (decorador) {
                case "Vida":
                    if (gb.getLife() < 4)//para que no tenga vidas infinitas
                        gb.setLife(gb.getLife() + 1);
                    break;
                case "Alta":
                    gb.vel = 2;
                    break;
                case "Baja":
                    gb.vel = 1;
                    break;
            }

            powerUps.setImagePath("images//BeeBlast//blast1.png"); //When bullet hits a bee, it shows a blast
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //exception handling
            }

            String tipo = "";
            switch ((int) ((Math.random() * 3) + 1)) {//Create random fruits
                case 1://
                    tipo = gb.gestorCreacional.procesarFuncion(1);
                    break;
                case 2://
                    tipo = gb.gestorCreacional.procesarFuncion(2);
                    break;
                case 3://
                    tipo = gb.gestorCreacional.procesarFuncion(3);
                    break;
            }

            System.out.println(tipo);

            if (tipo.equals("Manzana"))
                powerUps.setImagePath("images//Frutas//1.png"); //After Blast setting the image again
            if (tipo.equals("Banano"))
                powerUps.setImagePath("images//Frutas//2.png"); //After Blast setting the image again
            if (tipo.equals("Uva"))
                powerUps.setImagePath("images//Frutas//3.png"); //After Blast setting the image again

            powerUps.setX(1100); //Setting it again for coming continuously

        }
        if (isHit == true)
            GameSound.Shooter_Bee_Collide_Sound();
    }
}

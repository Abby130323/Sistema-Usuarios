package juegopatrondecorator;

public class Paladin implements Enemigo {

    @Override
    public String getInfo() {
        return "Paladin ";
    }

    @Override
    public int getAtaque() {
        return 1000;
    }

    @Override
    public int getDefensa() {
        return 2500;
    }
}

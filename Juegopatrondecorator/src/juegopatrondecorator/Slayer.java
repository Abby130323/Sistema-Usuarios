package juegopatrondecorator;

public class Slayer implements Enemigo {

    @Override
    public String getInfo() {
        return "Slayer ";
    }

    @Override
    public int getAtaque() {
        return 1700;
    }

    @Override
    public int getDefensa() {
        return 1000;
    }
}

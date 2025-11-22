package juegopatrondecorator;

public abstract class MejoraEnemigo implements Enemigo {

    protected Enemigo enemigo;

    public MejoraEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public String getInfo() {
        return enemigo.getInfo();
    }

    @Override
    public int getAtaque() {
        return enemigo.getAtaque();
    }

    @Override
    public int getDefensa() {
        return enemigo.getDefensa();
    }
}

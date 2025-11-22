package juegopatrondecorator;

public class EscudoMadera extends MejoraEnemigo {

    public EscudoMadera(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public String getInfo() {
        return enemigo.getInfo() + "+ Escudo de Madera ";
    }

    @Override
    public int getDefensa() {
        return enemigo.getDefensa() + 2500;
    }
}

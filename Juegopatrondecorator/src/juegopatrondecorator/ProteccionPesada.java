package juegopatrondecorator;

public class ProteccionPesada extends MejoraEnemigo {

    public ProteccionPesada(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public String getInfo() {
        return enemigo.getInfo() + "+ Proteccion Pesada ";
    }

    @Override
    public int getDefensa() {
        return enemigo.getDefensa() + 2900;
    }
}

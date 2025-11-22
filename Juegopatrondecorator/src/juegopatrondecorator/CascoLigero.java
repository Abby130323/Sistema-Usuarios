package juegopatrondecorator;

public class CascoLigero extends MejoraEnemigo {

    public CascoLigero(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public String getInfo() {
        return enemigo.getInfo() + "+ Casco Ligero ";
    }

    @Override
    public int getDefensa() {
        return enemigo.getDefensa() + 1200;
    }
}

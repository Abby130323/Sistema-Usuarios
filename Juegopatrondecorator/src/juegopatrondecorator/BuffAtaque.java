package juegopatrondecorator;

public class BuffAtaque extends MejoraEnemigo {

    public BuffAtaque(Enemigo enemigo) {
        super(enemigo);
    }
    
    @Override
    public String getInfo() {
        return enemigo.getInfo() + "+ Buff de Ataque ";
    }

    @Override
    public int getAtaque() {
        return enemigo.getAtaque() + 500;
    }
}

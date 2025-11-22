package juegopatrondecorator;

public class Main {

    public static void main(String[] args) {

        Enemigo enemigo = new Slayer(); 

        enemigo = new ProteccionPesada(enemigo);
        enemigo = new CascoLigero(enemigo);
        enemigo = new BuffAtaque(enemigo);

        System.out.println(enemigo.getInfo());
        System.out.println("Final Damage: " + enemigo.getAtaque());
        System.out.println("Final Defense: " + enemigo.getDefensa());
    }
}

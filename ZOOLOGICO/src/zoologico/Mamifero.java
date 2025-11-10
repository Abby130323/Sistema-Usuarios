package ZOOLOGICO;

public class Mamifero extends Animal {

    public Mamifero(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " corre y socializa con otros mamíferos.");
    }

    public void cuidarCrias() {
        System.out.println(nombre + " está cuidando a sus crías.");
    }
}

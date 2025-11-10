package ZOOLOGICO;

public class Iguana extends Reptil {

    public Iguana(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " trepa por las ramas y toma el sol en las rocas.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se rocían las plantas y se reorganiza el terrario de la iguana " + nombre + ".");
    }
}

package ZOOLOGICO;

public class Leon extends Mamifero {

    public Leon(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " patrulla su territorio y descansa al sol.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se retiran los restos y huesos del hábitat del león " + nombre + ".");
    }
}

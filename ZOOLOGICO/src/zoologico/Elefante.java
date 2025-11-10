package ZOOLOGICO;

public class Elefante extends Mamifero {

    public Elefante(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " se baña en el agua y juega con su trompa.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se lavan las zonas de barro del hábitat del elefante " + nombre + ".");
    }

    public void usarTrompa() {
        System.out.println(nombre + " está usando su trompa para recoger objetos.");
    }
}

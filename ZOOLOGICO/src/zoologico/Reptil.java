package ZOOLOGICO;

public class Reptil extends Animal {

    public Reptil(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " toma el sol para regular su temperatura corporal.");
    }

    public void cambiarPiel() {
        System.out.println(nombre + " está mudando su piel.");
    }
}

package ZOOLOGICO;

public class Cocodrilo extends Reptil {

    public Cocodrilo(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " nada sigilosamente esperando a su presa.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se drena y limpia el estanque del cocodrilo " + nombre + ".");
    }
}

package ZOOLOGICO;

public class Tigre extends Mamifero {

    public Tigre(String nombre, String habitat, int edad) {
        super(nombre, habitat, edad);
    }

    @Override
    public void actividadDiaria() {
        System.out.println(nombre + " acecha sigilosamente a su presa entre la vegetación.");
    }

    @Override
    public void limpiarHabitat() {
        System.out.println("Se retiran restos de caza y se revisan los escondites del tigre " + nombre + ".");
    }
}

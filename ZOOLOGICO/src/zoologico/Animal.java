package ZOOLOGICO;

public class Animal {
    protected String nombre;
    protected String habitat;
    protected int edad;

    public Animal(String nombre, String habitat, int edad) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.edad = edad;
    }

    public void mostrarFicha() {
        System.out.println("Animal: " + nombre);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Edad: " + edad + " años");
    }

    public void actividadDiaria() {
        System.out.println(nombre + " realiza su actividad diaria en el zoológico.");
    }

    public void limpiarHabitat() {
        System.out.println("El hábitat de " + nombre + " está siendo limpiado de forma general.");
    }
}

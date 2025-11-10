package ZOOLOGICO;

public class Trabajador extends Usuario {

    public Trabajador(String nombre, int idUsuario) {
        super(nombre, idUsuario, "Trabajador");
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " alimento al animal " + animal.nombre + ".");
    }

    public void limpiarHabitat(Animal animal) {
        System.out.println(nombre + " limpio el habitat de " + animal.nombre + ".");
    }

    @Override
    public void mostrarFunciones() {
        System.out.println("Funciones del trabajador:");
        System.out.println(" - Alimentar animales");
        System.out.println(" - Limpiar habitats");
        System.out.println(" - Registrar actividades diarias");
    }
}

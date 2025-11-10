package ZOOLOGICO;

public class Administrador extends Usuario {

    public Administrador(String nombre, int idUsuario) {
        super(nombre, idUsuario, "Administrador");
    }

    public void agregarAnimal(Animal animal) {
        System.out.println("El administrador " + nombre + " agrego al animal: " + animal.nombre);
    }

    public void eliminarAnimal(String nombreAnimal) {
        System.out.println("El administrador " + nombre + " elimino al animal: " + nombreAnimal);
    }

    public void verReportes() {
        System.out.println("El administrador " + nombre + " esta revisando los reportes de salud y alimentacion.");
    }

    @Override
    public void mostrarFunciones() {
        System.out.println("Funciones del administrador:");
        System.out.println(" - Agregar y eliminar animales");
        System.out.println(" - Ver reportes");
        System.out.println(" - Supervisar actividades del zoologico");
    }
}

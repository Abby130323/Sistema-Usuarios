package ZOOLOGICO;

public abstract class Usuario {
    protected String nombre;
    protected int idUsuario;
    protected String rol;

    public Usuario(String nombre, int idUsuario, String rol) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.rol = rol;
    }

    public void verAnimales(Animal[] animales) {
        System.out.println(nombre + " esta revisando la lista de animales:");
        for (Animal a : animales) {
            System.out.println(" - " + a.nombre + " (" + a.getClass().getSimpleName() + ")");
        }
    }

    public void registrarActividad(Animal animal) {
        System.out.println(nombre + " registro la actividad diaria de " + animal.nombre + ".");
    }

    public abstract void mostrarFunciones();
}

package GlobantProject;

// Clase que representa una tarea
// Concepto POO: Encapsulamiento
public class TareaGlobant {
    protected String nombreTarea;
    protected String detalle;
    protected int nivelPrioridad;

    // Método para mostrar información de la tarea
    public void mostrar() {
        System.out.println("Tarea: " + nombreTarea);
        System.out.println("Detalle: " + detalle);
        System.out.println("Prioridad: " + nivelPrioridad);
    }
}

package GlobantProject;

// Builder: permite construir tareas paso a paso
// Patrón Builder
public class ConstructorTareaGlobant {
    private TareaGlobant tarea = new TareaGlobant();

    public ConstructorTareaGlobant conNombre(String nombre) {
        tarea.nombreTarea = nombre;
        return this;
    }

    public ConstructorTareaGlobant conDetalle(String detalle) {
        tarea.detalle = detalle;
        return this;
    }

    public ConstructorTareaGlobant conPrioridad(int prioridad) {
        tarea.nivelPrioridad = prioridad;
        return this;
    }

    public TareaGlobant construir() {
        return tarea;
    }
}

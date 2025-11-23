package GlobantProject;

import javax.swing.JOptionPane;

// Clase de interfaz de usuario (dependencias: Singleton, Builder)
// Concepto: Dependencia, Polimorfismo
public class MenuGlobant {
    public void iniciar() {
        PersonaGlobant persona;

        // Loop hasta que se loguee correctamente
        do {
            persona = ServicioAuthGlobant.obtenerInstancia().iniciarSesion(); // Singleton + Factory
        } while (persona == null);

        // Polimorfismo: se ejecuta el mostrarAcceso() correspondiente al tipo real de usuario
        persona.mostrarAcceso();

        mostrarMenu(persona);
    }

    private void mostrarMenu(PersonaGlobant persona) {
        int opcion = -1;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MENU GLOBANT ===\n" +
                    "1. Crear tarea\n" +
                    "2. Ver tarea\n" +
                    "0. Salir"
                ));

                switch (opcion) {
                    case 1 -> crearTarea();
                    case 2 -> JOptionPane.showMessageDialog(null, "Aun no hay tareas guardadas.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
            }
        } while (opcion != 0);
    }

    private void crearTarea() {
        String nombre = JOptionPane.showInputDialog("Nombre de la tarea:");
        String detalle = JOptionPane.showInputDialog("Detalle de la tarea:");
        int prioridad = Integer.parseInt(JOptionPane.showInputDialog("Prioridad (1-5):"));

        // Builder: construye la tarea paso a paso
        TareaGlobant tarea = new ConstructorTareaGlobant()
                .conNombre(nombre)
                .conDetalle(detalle)
                .conPrioridad(prioridad)
                .construir();

        JOptionPane.showMessageDialog(null, "Tarea creada:\n" + nombre);
        tarea.mostrar();
    }
}

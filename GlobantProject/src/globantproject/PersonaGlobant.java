package GlobantProject;

// Clase base de todos los usuarios
// Conceptos: Herencia, Encapsulamiento
public class PersonaGlobant {
    protected String nombreUsuario;   // Encapsulamiento parcial (protected)
    protected String claveSecreta;
    protected RolGlobant tipoRol;

    // Constructor
    public PersonaGlobant(String nombreUsuario, String claveSecreta, RolGlobant tipoRol) {
        this.nombreUsuario = nombreUsuario;
        this.claveSecreta = claveSecreta;
        this.tipoRol = tipoRol;
    }

    // Getter del rol
    public RolGlobant obtenerRol() { return tipoRol; }

    // Getter del nombre
    public String obtenerNombre() { return nombreUsuario; }

    // Método que será sobrescrito por las subclases (Polimorfismo)
    public void mostrarAcceso() {
        System.out.println("Acceso basico de usuario.");
    }

    // Ejemplo de sobrecarga de método (no obligatorio, pero útil para POO)
    public void mostrarAcceso(String mensajeExtra) {
        System.out.println(mensajeExtra + " - Usuario: " + nombreUsuario);
    }
}

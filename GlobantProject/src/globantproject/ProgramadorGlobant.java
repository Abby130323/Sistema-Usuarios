package GlobantProject;

// ProgramadorGlobant hereda de PersonaGlobant
// Polimorfismo
public class ProgramadorGlobant extends PersonaGlobant {
    public ProgramadorGlobant(String nombre, String clave) {
        super(nombre, clave, RolGlobant.PROGRAMADOR);
    }

    @Override
    public void mostrarAcceso() {
        System.out.println("Acceso como Programador.");
    }
}
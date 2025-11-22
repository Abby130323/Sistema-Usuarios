package GlobantProject;

// LiderGlobant hereda de PersonaGlobant
// Polimorfismo
public class LiderGlobant extends PersonaGlobant {
    public LiderGlobant(String nombre, String clave) {
        super(nombre, clave, RolGlobant.LIDER);
    }

    @Override
    public void mostrarAcceso() {
        System.out.println("Acceso como Líder de Proyecto.");
    }
}
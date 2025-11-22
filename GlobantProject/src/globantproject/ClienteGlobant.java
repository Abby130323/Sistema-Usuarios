package GlobantProject;

// ClienteGlobant hereda de PersonaGlobant
// Herencia + Polimorfismo: sobrescribe mostrarAcceso()
public class ClienteGlobant extends PersonaGlobant {
    public ClienteGlobant(String nombre, String clave) {
        super(nombre, clave, RolGlobant.CLIENTE);
    }

    @Override
    public void mostrarAcceso() {
        System.out.println("Acceso como Cliente.");
    }
}





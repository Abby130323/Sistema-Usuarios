package GlobantProject;

import javax.swing.JOptionPane;

// Singleton: solo existe una instancia de ServicioAuthGlobant
public class ServicioAuthGlobant {
    private static ServicioAuthGlobant instancia; // instancia única

    // Constructor privado: evita crear nuevas instancias
    private ServicioAuthGlobant() {}

    // Método para obtener la instancia única
    public static ServicioAuthGlobant obtenerInstancia() {
        if (instancia == null) instancia = new ServicioAuthGlobant();
        return instancia;
    }

    // Método para iniciar sesión (dependencia: usa FabricaUsuarios)
    public PersonaGlobant iniciarSesion() {
        String usuario = JOptionPane.showInputDialog("Ingresa tu usuario:");
        String clave = JOptionPane.showInputDialog("Ingresa tu clave:");

        if(usuario.equals("admin") && clave.equals("admin")) {
            return FabricaUsuarios.crearUsuario(usuario, clave, RolGlobant.ADMINISTRADOR);
        }
        if(usuario.equals("lider") && clave.equals("123")) {
            return FabricaUsuarios.crearUsuario(usuario, clave, RolGlobant.LIDER);
        }
        if(usuario.equals("dev") && clave.equals("123")) {
            return FabricaUsuarios.crearUsuario(usuario, clave, RolGlobant.PROGRAMADOR);
        }
        if(usuario.equals("cliente") && clave.equals("123")) {
            return FabricaUsuarios.crearUsuario(usuario, clave, RolGlobant.CLIENTE);
        }

        JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        return null;
    }
}

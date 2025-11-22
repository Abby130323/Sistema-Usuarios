package GlobantProject;

// Factory: crea objetos de distintos tipos según el rol
// Patrón Factory
public class FabricaUsuarios {
    public static PersonaGlobant crearUsuario(String nombre, String clave, RolGlobant rol) {
        switch (rol) {
            case CLIENTE: return new ClienteGlobant(nombre, clave);
            case LIDER: return new LiderGlobant(nombre, clave);
            case PROGRAMADOR: return new ProgramadorGlobant(nombre, clave);
            case ADMINISTRADOR:
            default:
                return new PersonaGlobant(nombre, clave, RolGlobant.ADMINISTRADOR);
        }
    }
}

package sistemas.usuarios;

public class Profesor extends SistemasUsuarios{
    public String asignar_materia;
    public  String horario_clases;
    public String editar_notas;
    public String admin_notas;
    public String crear_notas;
    public String borrar_notas;
    
    public Profesor(String usuario, int id, String password,String asignar_materia, String horario_clases, String editar_notas, String admin_notas,
            String crear_notas, String borrar_notas){
        super(usuario, id, password);
        this.asignar_materia = asignar_materia;
        this.horario_clases = horario_clases;
        this.editar_notas = editar_notas;
        this.admin_notas = admin_notas;
        this.crear_notas = crear_notas;
        this.borrar_notas = borrar_notas;
        
    
}

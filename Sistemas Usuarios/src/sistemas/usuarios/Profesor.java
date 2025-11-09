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
        
    public String getAsignar_materia(){return asignar_materia;}
    public void setAsignar_materia(String asignar_materia){this.asignar_materia = asignar_materia;}
    
    public String getHorario_clases(){return horario_clases;}
    public void setHorario_clases(String horario_clases){this.horario_clases = horario_clases;}
    
    public String getEditar_notas(){return editar_notas;}
    public void setEditar_notas(String editar_notas){this.editar_notas = editar_notas;}
    
    public String getAdmin_notas(){return admin_notas;}
    public void setAdmin_notas(String admin_notas){this.admin_notas = admin_notas;}
    
    public String getCrear_notas(){return crear_notas;}
    public void setCrear_notas(String crear_notas){this.crear_notas = crear_notas;}
    
    public String getBorrar_notas(){return borrar_notas;}
    public void setBorrar_notas(String borrar_notas){this.borrar_notas = borrar_notas;}
    
    
    
}

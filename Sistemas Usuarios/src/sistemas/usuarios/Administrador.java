package sistemas.usuarios;

public  class Administrador extends SistemasUsuarios{
    private int horario_trabajo;
    public String modificar_notas;
    public  String eliminar_notas;
    public String asignar_permisos;
    public String agregar_usuarios;
    public String eliminar_usuarios;
    public String ver_lista_usuarios;
    
    public Administrador(String usuario, int id, String password,int horario_trabajo, String modificar_notas, String eliminar_notas, String asignar_notas,
            String asignar_permisos, String agregar_usuarios,String eliminar_usuarios, String ver_lista_usuarios){
        super(usuario, id, password);
        this.horario_trabajo = horario_trabajo;
        this.modificar_notas = modificar_notas;
        this.eliminar_notas = eliminar_notas;
        this.asignar_permisos = asignar_permisos;
        this.agregar_usuarios = agregar_usuarios;
        this.eliminar_usuarios = eliminar_usuarios;
        this.ver_lista_usuarios = ver_lista_usuarios;
    }
    public int getHorario_trabajo(){return horario_trabajo;}
    public void setHorario_trabajo(int horario_trabajo){this.horario_trabajo = horario_trabajo;}
    
    public String getModificar_notas(){return modificar_notas;}
    public void setModificar_notas(String modificar_notas){this.modificar_notas = modificar_notas;}
    
    public String getEliminar_notas(){return eliminar_notas;}
    public void setEliminar_notas(String eliminar_notas){this.eliminar_notas = eliminar_notas;}
    
    public String getAsignar_permisos(){return asignar_permisos;}
    public void setAsignar_permisos(String asignar_permisos){this.asignar_permisos = asignar_permisos;}
    
    public String getAgregar_usuarios(){return agregar_usuarios;}
    public void setAgregar_usuarios(String agregar_usuarios){this.agregar_usuarios = agregar_usuarios;}
    
    public String getEliminar_usuarios(){return eliminar_usuarios;}
    public void setEliminar_usuarios(String eliminar_usuarios){this.eliminar_usuarios = eliminar_usuarios;}
    
    public String getVer_lista_usuarios(){return ver_lista_usuarios;}
    public void setVer_lista_usuarios(String ver_lista_usuarios){this.ver_lista_usuarios = ver_lista_usuarios;}
}

package sistemas.usuarios;

public class Estudiante extends SistemasUsuarios {
    private String horario_clases;
    private String grupo;
    private String subir_trabajos;

    public Estudiante(String usuario, int id, String password,
                      String horario_clases, String grupo, String subir_trabajos) {
        super(usuario, id, password);
        this.horario_clases = horario_clases;
        this.grupo = grupo;
        this.subir_trabajos = subir_trabajos;
    }

    public String getHorario_clases() { return horario_clases; }
    
    public void setHorario_clases(String horario_clases) { this.horario_clases = horario_clases; }

    public String getGrupo() { return grupo; }
    public void setGrupo(String grupo) { this.grupo = grupo; }

    public String getSubir_trabajos() { return subir_trabajos; }
    public void setSubir_trabajos(String subir_trabajos) { this.subir_trabajos = subir_trabajos; }
}

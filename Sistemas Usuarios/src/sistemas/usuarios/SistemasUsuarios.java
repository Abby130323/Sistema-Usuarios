package sistemas.usuarios;

public class SistemasUsuarios {
    private String usuario;
    private int id;
    private String password;

    public SistemasUsuarios(String usuario, int id, String password) {
        this.usuario = usuario;
        this.id = id;
        this.password = password;
    }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPassword() { return password; }
    
    public void setPassword(String password) { this.password = password; }
}

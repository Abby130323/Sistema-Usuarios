/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemas.usuarios;

/**
 *
 * @author usuario
 */
public  class SistemasUsuarios {
        private String usuario;
        private int id;
        private String password;

    
    public SistemasUsuarios(String usuario, int id, String password) {
        this.usuario = usuario;
        this.id = id;
        this.password = password;
        }
    public String getUsuario(){return usuario;}
    public void setUsuario(String usuario){this.usuario = usuario;}
    
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    
    public String getPassword(){return password;}
    public void setPassword(){this.password = password;}
    
    
    
    
}

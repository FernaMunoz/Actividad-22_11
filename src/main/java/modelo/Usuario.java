package modelo;
public class Usuario{
  private int idUsuario;
  private String nombre;
  private String email;

  public Usuario(int idUsuario, String nombre, String email) {
      this.idUsuario = idUsuario;
      this.nombre = nombre;
      this.email = email;
  }
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}



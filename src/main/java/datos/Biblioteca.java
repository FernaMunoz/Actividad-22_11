package datos;
import modelo.MaterialBiblioteca;
import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<MaterialBiblioteca> catalogo;
    private List<Usuario> usuarios;
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<MaterialBiblioteca> getCatalogo() {
        return catalogo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void agregarMaterial(MaterialBiblioteca material){
        catalogo.add(material);
    }
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public MaterialBiblioteca buscarMateriaPorTitulo(String titulo){
        for (MaterialBiblioteca material : catalogo){
            if (material.getTitulo().equalsIgnoreCase(titulo)){
                return material;
            }
        } return null;
    }
    public Usuario buscarUsuarioPorId(int idUsuario){
        for ( Usuario usuario: usuarios){
            if(usuario.getIdUsuario() == idUsuario){
                return usuario;
            }
        } return null;
    }
}

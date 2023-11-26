package datos;
import modelo.Revista;
import modelo.Libro;
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
    public List<MaterialBiblioteca> buscarPorTitulo(String titulo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();

        for (MaterialBiblioteca material : catalogo) {
            // Cambiar el operador == por el método equals
            if (material.getTitulo().equals(titulo)) {
                resultados.add(material);
            }
        }

        return resultados;
    }

    public void mostrarBiblioteca() {
        for (MaterialBiblioteca material : catalogo) {
            System.out.println(material.toString());
        }



    }
}

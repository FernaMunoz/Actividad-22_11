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
    public List<MaterialBiblioteca> buscarMateriales (String criterio) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : catalogo) {
            if (material.getTitulo().equalsIgnoreCase(criterio)) {
                resultados.add(material);
            } else if (material.getAutor().equalsIgnoreCase(criterio)) {
                resultados.add(material);
            } else if (material instanceof Libro && ((Libro) material).getIsbn().equalsIgnoreCase(criterio)) {
                resultados.add(material);
            } else if (material instanceof Revista && ((Revista) material).getIssn().equalsIgnoreCase(criterio)) {
                resultados.add(material);
            }

        }return resultados;
        }
    }

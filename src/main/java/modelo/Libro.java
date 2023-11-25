package modelo;
import modelo.MaterialBiblioteca;
import interfaces.Prestable;
public class Libro extends MaterialBiblioteca implements Prestable {
    private String isbn;
    private String edicion;

    public Libro(int id, String titulo, String autor, String isbn, String edicion) {
        super(id, titulo, autor);
        this.isbn = isbn;
        this.edicion = edicion;
    }

        public String getIsbn() {
            return isbn;
        }
        public String getEdicion() {
            return edicion;
        }

        public void setIsbn(String isbn){
            this.isbn = isbn;
        }
        public void setEdicion(String edicion){
            this.edicion = edicion;
        }
    @Override
    public void mostrarInformacion() {
        System.out.println("Libro - ISBN: " + isbn + ", Titulo: " + getTitulo() + ", Autor: " + getAutor() + ", Edicion: " +edicion);
    }
    @Override
    public void prestar() {
        if (!isPrestado()){
            setPrestado(true);
            System.out.println("Prestamo del libro realizado");
        } else {
            System.out.println("El libro ya está prestado");
        }
    }
    @Override
    public void devolver() {
        if (isPrestado()){
            setPrestado(false);
            System.out.println("Devolución del libro realizada ");
        } else {
            System.out.println("El libro no está prestado");
        }
    }
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + isbn + '\'' +
                ", edicion='" + edicion + '\'' +
                '}';
    }
}

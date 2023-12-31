package modelo;

public abstract  class MaterialBiblioteca {
    private int id;
    private boolean prestado;
    private String titulo;
    private String autor;

    public MaterialBiblioteca(int id, String titulo, String autor){
        this.id = id;
        this.prestado = false;
        this.titulo = titulo;
        this.autor = autor;
    }
// getter
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean isPrestado(){
        return prestado;
    }
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public abstract void mostrarInformacion();

    @Override
    public String toString() {
        // Implementa la lógica para convertir la información del material a una cadena
        return "MaterialBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                // Otros atributos...
                '}';
    }

}




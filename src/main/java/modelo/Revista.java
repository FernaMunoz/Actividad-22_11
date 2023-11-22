package modelo;
import interfaces.Prestable;
public class Revista extends MaterialBiblioteca implements Prestable{
    private String issn;
    private int numero;
    public Revista (int id, String titulo, String autor, String issn, int numero) {
        super(id, titulo, autor);
        this.issn = issn;
        this.numero = numero;
    }
    public String getIssn() {
        return issn;
        }

    public int getNumero(){
        return numero;
        }
    public void setIssn(String issn){
        this.issn = issn;
        }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista - ISSN: " + issn + ", Titulo: " + getTitulo() + ", Número: " + numero);

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
}




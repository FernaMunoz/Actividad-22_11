package modelo;
import interfaces.Prestable;

import javax.swing.*;

public class Revista extends MaterialBiblioteca implements Prestable{
    private String Issn;
    private int Numero;
    public Revista (int id, String titulo, String autor, String Issn, int Numero) {
        super(id, titulo, autor);
        this.Issn = Issn;
        this.Numero = Numero;
    }
    public String getIssn() {
        return Issn;
    }

    public int getNumero() {
        return Numero;
    }

    public void setIssn(String Issn){
        this.Issn = Issn;
        }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista - ISSN: " + Issn + ", Titulo: " + getTitulo() + ", Número: " + Numero);

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




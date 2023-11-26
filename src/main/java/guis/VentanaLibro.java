package guis;

import datos.Biblioteca;
import modelo.Libro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLibro extends JFrame {

    public VentanaLibro(Biblioteca biblioteca) {

        setTitle("Agregar Libro");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Agregar un nuevo Libro a la Biblioteca");

        JLabel etiquetaId = new JLabel("ID:");
        JLabel etiquetaTitulo = new JLabel("Título:");
        JLabel etiquetaAutor = new JLabel("Autor:");
        JLabel etiquetaIsbn = new JLabel("ISBN:");
        JLabel etiquetaEdicion = new JLabel("Edición:");

        JTextField ID = new JTextField();
        JTextField Titulo = new JTextField();
        JTextField Autor = new JTextField();
        JTextField Isbn = new JTextField();
        JTextField Edicion = new JTextField();

        JButton botonAgregar = new JButton("Agregar Libro");

        etiqueta.setBounds(4,5,300,40);

        etiquetaId.setBounds(10,50,300,30);
        ID.setBounds(60,50,300,30);

        etiquetaTitulo.setBounds(10,95,300,30 );
        Titulo.setBounds(60,95,300,30);

        etiquetaAutor.setBounds(10,140,300,30);
        Autor.setBounds(60,140,300,30);

        etiquetaIsbn.setBounds(10,185,300,30);
        Isbn.setBounds(60,185,300,30);

        etiquetaEdicion.setBounds(10,230,300,30);
        Edicion.setBounds(60,230,300,30);

        botonAgregar.setBounds(350,300,200,40);

        panel.add(etiqueta);
        panel.add(etiquetaId);
        panel.add(ID);
        panel.add(etiquetaTitulo);
        panel.add(Titulo);
        panel.add(etiquetaAutor);
        panel.add(Autor);
        panel.add(etiquetaIsbn);
        panel.add(Isbn);
        panel.add(etiquetaEdicion);
        panel.add(Edicion);
        panel.add(new JLabel());
        panel.add(botonAgregar);

        add(panel);
        setVisible(true);

        botonAgregar.addActionListener(e -> {

            int id = Integer.parseInt(ID.getText());
            String titulo = Titulo.getText();
            String autor = Autor.getText();
            String isbn = Isbn.getText();
            String edicion = Edicion.getText();

            int numeroAntes = biblioteca.getCatalogo().size();

            Libro nuevoLibro = new Libro(id, titulo, autor, isbn, edicion);

            biblioteca.agregarMaterial(nuevoLibro);

            nuevoLibro.mostrarInformacion();
            dispose();

            biblioteca.mostrarBiblioteca();

            int numeroDespues = biblioteca.getCatalogo().size();
            if (numeroDespues == numeroAntes + 1) {
                System.out.println("El libro se ha agregado correctamente.");
            } else {
                System.out.println("Ha ocurrido un error al agregar el libro.");
            }
        });
    }
}


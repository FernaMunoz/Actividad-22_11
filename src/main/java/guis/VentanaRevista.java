package guis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Revista;
public class VentanaRevista extends JFrame {
    public VentanaRevista() {
        super("Registrar producto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Agregar un nuevo Libro a la Biblioteca");

        JLabel etiquetaId = new JLabel("ID:");
        JLabel etiquetaTitulo = new JLabel("Título:");
        JLabel etiquetaAutor = new JLabel("Autor:");
        JLabel etiquetaIssn = new JLabel("ISSN:");
        JLabel etiquetaNumero = new JLabel("Numero:");

        JTextField ID = new JTextField();
        JTextField Titulo = new JTextField();
        JTextField Autor = new JTextField();
        JTextField Issn = new JTextField();
        JTextField Numero = new JTextField();

        JButton botonAgregar = new JButton("Agregar Libro");

        etiqueta.setBounds(4,5,300,40);

        etiquetaId.setBounds(10,50,300,30);
        ID.setBounds(60,50,300,30);

        etiquetaTitulo.setBounds(10,95,300,30 );
        Titulo.setBounds(60,95,300,30);

        etiquetaAutor.setBounds(10,140,300,30);
        Autor.setBounds(60,140,300,30);

        etiquetaIssn.setBounds(10,185,300,30);
        Issn.setBounds(60,185,300,30);

        etiquetaNumero.setBounds(10,230,300,30);
        Numero.setBounds(60,230,300,30);

        botonAgregar.setBounds(350,300,200,40);

        panel.add(etiqueta);
        panel.add(etiquetaId);
        panel.add(ID);
        panel.add(etiquetaTitulo);
        panel.add(Titulo);
        panel.add(etiquetaAutor);
        panel.add(Autor);
        panel.add(etiquetaIssn);
        panel.add(Issn);
        panel.add(etiquetaNumero);
        panel.add(Numero);
        panel.add(new JLabel());
        panel.add(botonAgregar);

        add(panel);
        setVisible(true);

        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(ID.getText());
                String titulo = Titulo.getText();
                String autor = Autor.getText();
                String isbn = Issn.getText();
                int edicion = Integer.parseInt(Numero.getText());

                Revista nuevaRevista = new Revista(id, titulo, autor, Issn, Numero);

                nuevaRevista.mostrarInformacion();
            }
        });

    }
}

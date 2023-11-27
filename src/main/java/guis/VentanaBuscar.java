package guis;

import datos.Biblioteca;
import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VentanaBuscar extends JFrame {
    private Biblioteca biblioteca;
    private JTextField busqueda;
    private JTextArea resultado;

    public VentanaBuscar(Biblioteca biblioteca) {
        super("Buscar producto");
        this.biblioteca = biblioteca;

        SwingUtilities.invokeLater(() -> {
            initComponents();
            setLayout(new FlowLayout());
            setSize(600, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
        });
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel("Buscar producto de la biblioteca", SwingConstants.CENTER);
        JLabel etiqueta2 = new JLabel("Ingrese criterio de búsqueda: ");

        busqueda = new JTextField(20);
        JButton botonBuscar = new JButton("Buscar");
        resultado = new JTextArea();

        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(busqueda);
        panel.add(botonBuscar);
        panel.add(resultado);

        add(panel);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }

        });
    }

    private void buscarProducto() {
        String titulo = busqueda.getText();
        List<MaterialBiblioteca> resultados = biblioteca.buscarPorTitulo(titulo);
        resultado.setText("");

        System.out.println("Título de búsqueda: " + titulo);
        System.out.println("Número de resultados: " + resultados.size());

        for (MaterialBiblioteca material : resultados) {
            resultado.append(material.toString() + "\n");
        }
    }

    private void mostrarCatalogoEnInterfaz() {
        resultado.setText(""); // Limpiar el área de resultados
        List<MaterialBiblioteca> catalogo = biblioteca.getCatalogo();

        for (MaterialBiblioteca material : catalogo) {
            resultado.append(material.toString() + "\n");
        }
    }
}

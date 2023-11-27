package guis;

import datos.Biblioteca;
import modelo.MaterialBiblioteca;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistrar extends JFrame {
    private JTextField idUsuario;
    private JTextField idMaterial;
    private JRadioButton radioPrestamo;
    private JRadioButton radioDevolucion;
    private JTextArea resultado;
    private Biblioteca biblioteca;

    public VentanaRegistrar(Biblioteca biblioteca) {
        super("Registrar préstamos y devoluciones");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.biblioteca = biblioteca;

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel etiqueta = new JLabel("Registrar préstamos y devoluciones", SwingConstants.CENTER);
        JLabel etiquetaUsuario = new JLabel("ID Usuario:");
        JLabel etiquetaMaterial = new JLabel("ID Material:");
        JLabel etiquetaOperacion = new JLabel("Operación:");

        idUsuario = new JTextField();
        idMaterial = new JTextField();

        radioPrestamo = new JRadioButton("Préstamo");
        radioDevolucion = new JRadioButton("Devolución");

        ButtonGroup grupoOperacion = new ButtonGroup();
        grupoOperacion.add(radioPrestamo);
        grupoOperacion.add(radioDevolucion);

        JButton botonRegistrar = new JButton("Registrar");

        resultado = new JTextArea();

        etiqueta.setBounds(150, 10, 300, 30);
        etiquetaUsuario.setBounds(50, 50, 100, 30);
        idUsuario.setBounds(150, 50, 150, 30);
        etiquetaMaterial.setBounds(50, 100, 100, 30);
        idMaterial.setBounds(150, 100, 150, 30);
        etiquetaOperacion.setBounds(50, 150, 100, 30);
        radioPrestamo.setBounds(150, 150, 100, 30);
        radioDevolucion.setBounds(250, 150, 100, 30);
        botonRegistrar.setBounds(200, 200, 150, 30);
        resultado.setBounds(50, 250, 500, 100);

        panel.add(etiqueta);
        panel.add(etiquetaUsuario);
        panel.add(idUsuario);
        panel.add(etiquetaMaterial);
        panel.add(idMaterial);
        panel.add(etiquetaOperacion);
        panel.add(radioPrestamo);
        panel.add(radioDevolucion);
        panel.add(botonRegistrar);
        panel.add(resultado);

        add(panel);
        setVisible(true);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarPrestamo(e.getActionCommand().equals("Registrar Préstamo"));
            }
        });
    }

    private void registrarPrestamo(boolean esPrestamo) {
        int idMaterialInt = Integer.parseInt(idMaterial.getText());
        int idUsuarioInt = Integer.parseInt(idUsuario.getText());

        MaterialBiblioteca material = buscarMaterialPorId(idMaterialInt);
        Usuario usuario = buscarUsuarioPorId(idUsuarioInt);

        if (material != null && usuario != null) {
            if (esPrestamo) {
                realizarPrestamo(material, usuario);
            } else {
                realizarDevolucion(material, usuario);
            }
        } else {
            resultado.setText("Error: Material o Usuario no encontrado.");
        }
    }

    private MaterialBiblioteca buscarMaterialPorId(int id) {
        for (MaterialBiblioteca material : biblioteca.getCatalogo()) {
            if (material.getId() == id) {
                return material;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : biblioteca.getUsuarios()) {
            if (usuario.getIdUsuario() == id) {
                return usuario;
            }
        }
        return null;
    }

    private void realizarPrestamo(MaterialBiblioteca material, Usuario usuario) {
        if (!material.isPrestado()) {
            material.setPrestado(true);
            resultado.setText("Préstamo realizado correctamente.");
        } else {
            resultado.setText("Error: El material ya está prestado.");
        }
    }

    private void realizarDevolucion(MaterialBiblioteca material, Usuario usuario) {
        if (material.isPrestado()) {
            material.setPrestado(false);
            resultado.setText("Devolución realizada correctamente.");
        } else {
            resultado.setText("Error: El material no está prestado.");
        }
    }
}


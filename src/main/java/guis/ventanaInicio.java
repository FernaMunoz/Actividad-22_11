package guis;
import datos.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaInicio extends JFrame implements ActionListener {
    public ventanaInicio() {

        super("Biblioteca");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Bienvenido a la Biblioteca", SwingConstants.CENTER);

        JButton boton1 = new JButton("Agregar Nuevos Productos");
        JButton boton2 = new JButton("Buscar Productos");
        JButton boton3 = new JButton("Registrar préstamos y devoluciones");

        etiqueta.setBounds(200, 50, 200, 50);
        boton1.setBounds(170, 100, 250, 40);
        boton2.setBounds(170, 150, 250, 40);
        boton3.setBounds(170, 200, 250, 40);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        panel.add(etiqueta);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        add(panel);

        setVisible(true);

    }
    @Override
       public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar Nuevos Productos")) {
            ventanaAgregar VentanaAgregar = new ventanaAgregar();
            VentanaAgregar.setVisible(true);
        }else if (e.getActionCommand().equals("Buscar Productos")) {
            Biblioteca biblioteca = new Biblioteca();
            VentanaBuscar ventanaBuscar = new VentanaBuscar(biblioteca);
            ventanaBuscar.setVisible(true);
        } else if (e.getActionCommand().equals("Registrar préstamos y devoluciones")) {
            VentanaRegistrar ventanaRegistrar = new VentanaRegistrar();
            ventanaRegistrar.setVisible(true);
        }
    }
    }

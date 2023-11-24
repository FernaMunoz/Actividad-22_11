package guis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaAgregar extends JFrame implements ActionListener {
    public ventanaAgregar() {
        super("Agregar producto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Agregar Nuevos Productos a la biblioteca", SwingConstants.CENTER);

        JButton BotonLibro = new JButton("Libro");
        JButton BotonRevista = new JButton("Revista");

        etiqueta.setBounds(50, 50, 300, 50);
        BotonLibro.setBounds(90, 120, 100, 40);
        BotonRevista.setBounds(200, 120, 100, 40);

        BotonLibro.addActionListener(this);
        BotonRevista.addActionListener(this);

        panel.add(etiqueta);
        panel.add(BotonLibro);
        panel.add(BotonRevista);

        add(panel);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Libro")){
            VentanaLibro ventanaLibro = new VentanaLibro();
            ventanaLibro.setVisible(true);
        } else if(e.getActionCommand().equals("Revista")){
            VentanaRevista ventanaRevista = new VentanaRevista();
            ventanaRevista.setVisible(true);
            }
        }
    }




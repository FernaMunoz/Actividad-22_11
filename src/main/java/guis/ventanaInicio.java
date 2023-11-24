package guis;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class ventanaInicio extends JFrame {
    public ventanaInicio() {

        super("Biblioteca");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();//(new FlowLayout());
        panel.setLayout(null);
        JLabel etiqueta = new JLabel(("Bienvenido a la Biblioteca"));

        JButton boton1 = new JButton("Agregar Nuevos Productos");
        JButton boton2 = new JButton("Buscar Productos");
        JButton boton3 = new JButton("Registrar préstamos y devoluciones");

        etiqueta.setBounds(225,50, 200,50);
        boton1.setBounds(170,100, 250,40);
        boton2.setBounds(170,150,250,40);
        boton3.setBounds(170,200,250,40);

        panel.add(etiqueta);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        add(panel);

        setVisible(true);
    }
}

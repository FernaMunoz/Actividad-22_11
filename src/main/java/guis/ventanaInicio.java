package guis;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ventanaInicio extends JFrame {
    public ventanaInicio() {
        super("Bienvenido a la Biblioteca");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        JButton boton1 = new JButton("Agregar Nuevos Productos");
        JButton boton2 = new JButton("Buscar Productos");
        JButton boton3 = new JButton("Registrar préstamos y devoluciones");

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        add(panel);

        setVisible(true);
    }
}

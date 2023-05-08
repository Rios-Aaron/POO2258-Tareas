package Tarea10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta1;
    private JTextField txtGrados;
    private JButton boton1;
    private JLabel lblResultado;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        etiqueta1 = new JLabel("Grados C. ");
        this.getContentPane().add(etiqueta1);
        txtGrados= new JTextField(10);
        this.getContentPane().add(txtGrados);
        boton1 = new JButton("Convertir");
        this.getContentPane().add(boton1);
        lblResultado = new JLabel("0.0");
        this.getContentPane().add(lblResultado);
        //eventos
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtGrados.getText());
                double fahrenheit =(centigrados*9.0/5.0) + 32.0;
                lblResultado.setText(fahrenheit + " Grados F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"Adios...");
                System.exit(0);
            }
        });


        this.setVisible(true);
    }
}
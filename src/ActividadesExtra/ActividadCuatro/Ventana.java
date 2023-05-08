package ActividadesExtra.ActividadCuatro;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    private JPanel panel4;
    private JLabel etiquetaPanel4;
    private JTextField txtCuadroPanel4;
    private JButton botonPanel4;

    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel();
        panel1.setBackground(new Color(181, 206, 247));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("Presioname");
        panel1.add(botonPanel1);
        etiquetaPanel1= new JLabel("...");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el boton del panel 1!");
            }
        });
        this.getContentPane().add(panel1,0);

        //panel2
        String urlImagen ="https://cdn-icons-png.flaticon.com/128/3800/3800591.png";
        panel2 = new JPanel();
        panel2.setBackground(new Color(213, 193, 245));
        panel2.setLayout(new FlowLayout());
        //cargar la imagen de internet
        try {
            URL url = new URL(urlImagen);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(image);
            etiquetaPanel2 = new JLabel(imageIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        } catch (MalformedURLException mfe){
            System.out.println("URL no valida");
        }catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }

        //panel3
        panel3 = new JPanel();
        panel3.setBackground(new Color(250, 192, 234));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos ={"opcion 1","opcion 2","opcion 3","opcion 4"};
        comboBoxPanel3= new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);

        //panel4
        panel4 = new JPanel();
        panel4.setBackground(new Color(170, 250, 207));
        panel4.setLayout(new FlowLayout());
        etiquetaPanel4 = new JLabel("Nombre: ");
        panel4.add(etiquetaPanel4);
        txtCuadroPanel4 = new JTextField(30);
        panel4.add(txtCuadroPanel4);
        botonPanel4 = new JButton("Saludar");
        panel4.add(botonPanel4);
        botonPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = txtCuadroPanel4.getText();
                JOptionPane.showMessageDialog(null,"Hola " + texto);
            }
        });
        this.getContentPane().add(panel4,3);

        //cerrar el programa
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
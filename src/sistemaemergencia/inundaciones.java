package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inundaciones extends JFrame {

    ImageIcon inun, llamar, atras;
    JLabel agua, call, back;
    JButton instrucciones;

    public inundaciones() {
        frame();
        componentes();
        acciones();

    }

    public void frame() {
        this.setTitle("SISMO");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(700, 600)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(700, 600)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void componentes() {
        inun = new ImageIcon("gifs\\inundacion2.png");
        agua = new JLabel(inun);
        llamar = new ImageIcon("gifs\\llamar.png");
        call = new JLabel(llamar);
        instrucciones = new JButton("Instrucciones");
        atras = new ImageIcon("gifs\\back1.png");
        back = new JLabel(atras);
        agua.setBounds(140, 30, 450, 450);
        call.setBounds(10, 10, 50, 50);
        instrucciones.setBounds(300, 450, 140, 30);
        back.setBounds(10, 500, 50, 50);

        this.add(agua);
        this.add(call);
        this.add(instrucciones);
        this.add(back);
    }

    public void acciones() {
        MouseListener ecolo = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emergencia emer = new emergencia();
                dispose();
                emer.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        back.addMouseListener(ecolo);
        ActionListener ins = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "1. Tenga un plan de evacuación y establezca una ruta para el mismo."
                        + "\n 2. No entre a ninguna aula si ya esta cubierto de agua en la plantta baja."
                        + "\n 3. No consuma ningún alimento que pudiera haber estado en contacto con las aguas de la inundación ya que pudieran estar contaminadas."
                        + "\n 4. Esté alerta a peligros de fuego como conductos o tuberías de gas expuestos o rotos, circuitos eléctricos que estén mojados y por tanto hacen contacto, o materiales peligrosos que hayan sido arrastrados por las aguas");
            }
        };
        instrucciones.addActionListener(ins);
    }
}

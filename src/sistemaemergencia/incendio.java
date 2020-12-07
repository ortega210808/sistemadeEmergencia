package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 80023
 */
public class incendio extends JFrame {

    ImageIcon incen, llamar, atras;
    JLabel fire, call, back;
    JButton instrucciones;

    public incendio() {
        frame();
        componentes();
        acciones();
    }

    public void frame() {
        this.setTitle("EMERGENCIA");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(400, 400)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(400, 400)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void componentes() {
        incen = new ImageIcon("gifs\\bomberosGif.gif");
        fire = new JLabel(incen);
        llamar = new ImageIcon("gifs\\llamar.png");
        call = new JLabel(llamar);
        instrucciones = new JButton("Instrucciones");
        atras = new ImageIcon("gifs\\back1.png");
        back = new JLabel(atras);

        fire.setBounds(80, 30, 300, 300);
        call.setBounds(10, 10, 50, 50);
        instrucciones.setBounds(110, 250, 140, 30);
        back.setBounds(3, 310, 50, 50);

        this.add(fire);
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
    }

}

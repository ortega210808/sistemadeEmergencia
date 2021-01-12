package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sismo extends JFrame {

    ImageIcon sismo, llamar, atras;
    JLabel temblor, call, back;
    JButton instrucciones;

    public sismo() {
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
        sismo = new ImageIcon("gifs\\sismo.jpg");
        temblor = new JLabel(sismo);
        llamar = new ImageIcon("gifs\\llamar.png");
        call = new JLabel(llamar);
        instrucciones = new JButton("Instrucciones");
        atras = new ImageIcon("gifs\\back1.png");
        back = new JLabel(atras);
        temblor.setBounds(140, 30, 450, 450);
        call.setBounds(10, 10, 50, 50);
        instrucciones.setBounds(300, 450, 140, 30);
        back.setBounds(10, 500, 50, 50);

        this.add(temblor);
        this.add(call);
        this.add(instrucciones);
        this.add(back);
    }

    public void acciones() {
        MouseListener regre = new MouseListener() {
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
        back.addMouseListener(regre);
        ActionListener ins = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "1. Identificar las zonas de seguridad."
                        + "\n 2. Mantenerse alejado de las ventanas."
                        + "\n 3. Permanecer lejos de los libreros o muebles que pudieran caerse."
                        + "\n 4. Esperar a que el personal brigadista dentro de la escuela haga una revisión de las instalaciones."
                        + "\n 5. No correr, no empujar y no gritar.");
            }
        };
        instrucciones.addActionListener(ins);

    }
}

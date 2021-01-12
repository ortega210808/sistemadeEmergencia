package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HL extends JFrame {

    JButton Reg;
    JLabel HEI;
    ImageIcon CA, back;

    public HL() {

        ventana3();
        componentes1();
        regresar();
    }

    private void ventana3() {
        this.setTitle("Compresión Abdominal");
        this.setResizable(false);
        this.setSize(new Dimension(500, 400));
        this.setMinimumSize(new Dimension(500, 400));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void componentes1() {
        back = new ImageIcon("gifs\\back.png");
        Reg = new JButton(back);
        Reg.setFont(new Font("Arial", Font.ITALIC, 12));
        Reg.setBounds(195, 300, 120, 30);
        CA = new ImageIcon("gifs\\priaux\\CA.png");
        HEI = new JLabel(CA);
        Reg.setContentAreaFilled(false);
        Reg.setBorder(null);
        HEI.setBounds(15, 50, 465, 225);

        this.add(Reg);
        this.add(HEI);

    }

    private void regresar() {

        ActionListener ad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                primerosAuxilios ad = new primerosAuxilios();
                ad.setVisible(true);
                dispose();
            }

        };
        Reg.addActionListener(ad);

    }
}

package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RCP extends JFrame {

    JButton Reg;
    JLabel RECP;
    ImageIcon rcp;

    public RCP() {

        ventana2();
        componentes1();
        regresar();
    }

    private void ventana2() {
        this.setTitle("Resucitacion Cardio Pulmunar");
        this.setResizable(false);
        this.setSize(new Dimension(550, 350));
        this.setMinimumSize(new Dimension(600, 300));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void componentes1() {
        Reg = new JButton("Regresar");
        Reg.setFont(new Font("Arial", Font.ITALIC, 12));
        Reg.setBounds(240, 280, 120, 30);

        rcp = new ImageIcon("gifs\\priaux\\rcp.png");
        RECP = new JLabel(rcp);
        RECP.setBounds(25, 10, 550, 250);

        this.add(Reg);
        this.add(RECP);

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

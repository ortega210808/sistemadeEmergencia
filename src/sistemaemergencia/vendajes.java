package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vendajes extends JFrame {

    JLabel L1, L2, L3, L4, L5, L6;
    ImageIcon vendajes1, v2, v3, v4, v5, v6, ba;
    JButton Reg;

    public vendajes() {
        ventana();
        componentes1();
        regresar();
    }

    public void ventana() {
        this.setTitle("VENDAJES");
        this.setResizable(false);
        this.setSize(new Dimension(550, 400));
        this.setMinimumSize(new Dimension(400, 300));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void componentes1() {
        ba = new ImageIcon("gifs\\back.png");
        Reg = new JButton(ba);
        Reg.setContentAreaFilled(false);
        Reg.setBorder(null);
        Reg.setBounds(200, 330, 120, 30);

        vendajes1 = new ImageIcon("gifs\\priaux\\vendajes.png");
        L1 = new JLabel(vendajes1);

        L1.setBounds(10, 10, 150, 135);

        v2 = new ImageIcon("gifs\\priaux\\v2.png");
        L2 = new JLabel(v2);

        L2.setBounds(150, 10, 172, 135);

        v3 = new ImageIcon("gifs\\priaux\\v3.png");
        L3 = new JLabel(v3);

        L3.setBounds(330, 10, 150, 135);

        v4 = new ImageIcon("gifs\\priaux\\v4.png");
        L4 = new JLabel(v4);

        L4.setBounds(10, 180, 150, 135);

        v5 = new ImageIcon("gifs\\priaux\\v5.png");
        L5 = new JLabel(v5);

        L5.setBounds(175, 180, 150, 135);

        v6 = new ImageIcon("gifs\\priaux\\v6.png");
        L6 = new JLabel(v6);

        L6.setBounds(350, 180, 150, 135);

        this.add(L1);
        this.add(L2);
        this.add(L3);
        this.add(L4);
        this.add(L5);
        this.add(L6);
        this.add(Reg);

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

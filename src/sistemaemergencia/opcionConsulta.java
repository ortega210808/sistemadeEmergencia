package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class opcionConsulta extends JFrame {

    JButton opA, opAd, h, back;
    ImageIcon home, ba;

    public opcionConsulta() {
        super();
        frame();
        contenido();
        acciones();
    }

    public void frame() {
        this.setTitle("Escoja una opción");
        this.setResizable(false);
        this.setSize(new Dimension(300, 200));
        this.setMinimumSize(new Dimension(300, 200));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.pack();
        this.getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void contenido() {
        ba = new ImageIcon("gifs\\back.png");
        back = new JButton(ba);
        opA = new JButton("Alumno");
        opAd = new JButton("Administrativo");
        home = new ImageIcon("gifs\\home.png");
        h = new JButton(home);

        opA.setBounds(20, 60, 100, 30);
        opAd.setBounds(140, 60, 140, 30);
        h.setBounds(45, 130, 40, 40);
        h.setContentAreaFilled(false);
        h.setBorder(null);
        back.setBounds(10, 130, 40, 40);
        back.setContentAreaFilled(false);
        back.setBorder(null);

        this.add(opA);
        this.add(opAd);
        this.add(h);
        this.add(back);
    }

    public void acciones() {
        ActionListener ho = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SistemaEmergencia emer = new SistemaEmergencia();
                emer.setVisible(true);
                dispose();
            }
        };
        h.addActionListener(ho);
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultaAlumno con = new consultaAlumno();
                con.setVisible(true);
                dispose();
            }
        };
        opA.addActionListener(a);
        ActionListener ad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultaAdmin conad = new consultaAdmin();
                conad.setVisible(true);
                dispose();
            }
        };
        opAd.addActionListener(ad);
        ActionListener bac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones op = new opciones();
                op.setVisible(true);
                dispose();
            }
        };
        back.addActionListener(bac);
    }
}

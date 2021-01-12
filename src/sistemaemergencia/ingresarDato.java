package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ingresarDato extends JFrame {

    JButton opA, opAd, back;
    ImageIcon regre;

    public ingresarDato() {
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
        regre = new ImageIcon("gifs\\back.png");
        back = new JButton(regre);
        opA = new JButton("Alumno");
        opAd = new JButton("Administrativo");

        back.setBounds(10, 137, 40, 40);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        opA.setBounds(20, 60, 100, 30);
        opAd.setBounds(140, 60, 140, 30);

        this.add(opA);
        this.add(opAd);
        this.add(back);

    }

    public void acciones() {
        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datoAlumno alum = new datoAlumno();
                dispose();
            }
        };
        ActionListener regre = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones opc = new opciones();
                dispose();
            }
        };
        opA.addActionListener(a1);
        back.addActionListener(regre);
    }
}

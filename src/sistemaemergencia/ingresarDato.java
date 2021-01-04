package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ingresarDato extends JFrame {

    JButton opA, opAd;

    public ingresarDato() {
        frame();
        contenido();
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
        opA = new JButton("Alumno");
        opAd = new JButton("Administrativo");

        opA.setBounds(20, 60, 100, 30);
        opAd.setBounds(140, 60, 140, 30);

        this.add(opA);
        this.add(opAd);

    }
}

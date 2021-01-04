package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class opciones extends JFrame {

    JButton consultar, ingresar, back;
    ImageIcon regresar;

    public opciones() {
        frame();
        contenido();
        acciones();
    }

    public void frame() {
        this.setTitle("Administradores");
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
        regresar = new ImageIcon("gifs\\back.png");
        back = new JButton(regresar);

        consultar = new JButton("Consulta");
        ingresar = new JButton("Ingresar");

        consultar.setBounds(20, 60, 100, 30);
        ingresar.setBounds(140, 60, 140, 30);

        back.setBounds(10, 130, 40, 40);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        this.add(consultar);
        this.add(ingresar);
        this.add(back);
    }

    public void acciones() {
        ActionListener con = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcionConsulta con = new opcionConsulta();
                con.setVisible(true);
                dispose();
            }
        };
        consultar.addActionListener(con);
        ActionListener ingre = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarDato ingre = new ingresarDato();
                ingre.setVisible(true);
                dispose();
            }
        };
        ingresar.addActionListener(ingre);
        ActionListener regre = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SistemaEmergencia sis = new SistemaEmergencia();
                sis.setVisible(true);
                dispose();
            }
        };
        back.addActionListener(regre);
    }

}

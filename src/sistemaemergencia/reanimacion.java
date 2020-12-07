package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ADRIANA,YAIR,CESAR
 */
public class reanimacion extends JFrame {

    JLabel texto, texto1, texto2, texto3;
    JLabel imagen;
    ImageIcon etiqueta;
    JButton emergenciaAtendida, volver, llamar;
    ImageIcon conf, back, call;

    public reanimacion() {
        frame();
        componentes();
        acciones();
    }

    public void frame() {
        this.setTitle("REANIMACION");
        this.setResizable(false);
        this.setSize(new Dimension(1000, 850));
        this.setMinimumSize(new Dimension(1000, 850));
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void componentes() {
        call = new ImageIcon("gifs\\llamar.png");
        llamar = new JButton(call);
        back = new ImageIcon("gifs\\back1.png");
        volver = new JButton(back);
        conf = new ImageIcon("gifs\\confirmar.png");
        emergenciaAtendida = new JButton(conf);
        texto = new JLabel("/// 1. Coloque la base de una mano en el esternón, justo entre los pezones. ///");
        texto1 = new JLabel("/// 2. Coloque la base de la otra mano sobre la primera mano. ///");
        texto2 = new JLabel("/// 3. Ubique el cuerpo directamente sobre las manos. ///");
        texto3 = new JLabel("/// 4. Aplique 30 compresiones. Estas deben ser rápidas y fuertes. ///");

        texto.setFont(new Font("Colonna MT", Font.BOLD, 25));
        texto1.setFont(new Font("Colonna MT", Font.BOLD, 25));
        texto2.setFont(new Font("Colonna MT", Font.BOLD, 25));
        texto3.setFont(new Font("Colonna MT", Font.BOLD, 25));

        imagen = new JLabel();
        etiqueta = new ImageIcon("gifs\\reanimacion.gif");

        texto.setBounds(40, 450, 900, 40);
        texto1.setBounds(40, 500, 900, 40);
        texto2.setBounds(40, 550, 900, 40);
        texto3.setBounds(40, 600, 900, 40);

        emergenciaAtendida.setBounds(400, 700, 180, 55);
        emergenciaAtendida.setContentAreaFilled(false);
        emergenciaAtendida.setBorder(null);
        imagen.setIcon(etiqueta);
        imagen.setBounds(220, 10, 600, 400);

        volver.setBounds(10, 750, 40, 40);
        volver.setContentAreaFilled(false);
        volver.setBorder(null);

        llamar.setBounds(10, 10, 50, 50);
        llamar.setContentAreaFilled(false);
        llamar.setBorder(null);

        this.add(texto);
        this.add(texto1);
        this.add(texto2);
        this.add(texto3);
        this.add(imagen);
        this.add(emergenciaAtendida);
        this.add(volver);
        this.add(llamar);

    }

    public void acciones() {
        ActionListener btnConfirmar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La emergencia se atendió y se actualizó en la base de datos", "EMERGENCIA ATENDIDA", 1);
                SistemaEmergencia emer = new SistemaEmergencia(); //OBJETO CLASE PRINCIPAL
                dispose(); //CERRAMOS CLASE ACTUAL 
                emer.setVisible(true); //INICIAMOS CLASE PRINCIPAL 

            }
        };
        ActionListener btnVolver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SistemaEmergencia emer = new SistemaEmergencia(); //OBJETO CLASE PRINCIPAL
                dispose(); //CERRAMOS CLASE ACTUAL 
                emer.setVisible(true); //INICIAMOS CLASE PRINCIPAL 
            }

        };
        ActionListener btnLlamar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "SE LES DIÓ AVISO A LAS AUTORIDADES CORRESPONDIENTES");
            }

        };

        emergenciaAtendida.addActionListener(btnConfirmar);
        volver.addActionListener(btnVolver);
        llamar.addActionListener(btnLlamar);
    }
}

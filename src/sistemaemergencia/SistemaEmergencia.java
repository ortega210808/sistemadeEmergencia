package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ADRIANA,YAIR,CESAR
 */
public class SistemaEmergencia extends JFrame {

    JLabel sistema;
    JComboBox opc;
    JButton aceptar;
    ImageIcon cruz;
    JTextField codigoA;

    public SistemaEmergencia() {
        super();
        frame();
        textos();
        opcionesEmergencia();
        siguiente();
    }

    public void frame() {
        this.setTitle("EMERGENCIA");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(550, 350)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(550, 350)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void textos() {
        sistema = new JLabel();

        sistema.setText("SISTEMA DE EMERGENCIA");
        sistema.setForeground(Color.BLACK);
        sistema.setFont(new Font("Colonna MT", Font.BOLD, 30));
        sistema.setBounds(75, 40, 400, 50);
        this.add(sistema);
    }

    public void opcionesEmergencia() {
        codigoA = new JTextField();
        opc = new JComboBox();
        aceptar = new JButton();
        cruz = new ImageIcon("cruz-roja.png");
        opc.addItem("01 Reanimación");
        opc.addItem("02 Emergencia");
        /*opc.addItem("03 Urgencia");
                  opc.addItem("04 Urgencia Menor");
                  opc.addItem("05 No Urgente");*/
        opc.setBounds(270, 100, 240, 40);

        codigoA.setBounds(20, 100, 240, 40);

        aceptar.setText("CONFIRMAR");
        aceptar.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        aceptar.setIcon(cruz);
        aceptar.setBounds(165, 200, 180, 35);

        this.add(opc);
        this.add(aceptar);
        this.add(codigoA);

    }

    public void siguiente() {
        ActionListener acp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "EMERGENCIA RECIBIDA: " + opc.getSelectedItem());
                //JOptionPane.showMessageDialog(null, "SE LES DIÓ AVISO A LAS AUTORIDADES CORRESPONDIENTES");
                if (opc.getSelectedIndex() == 0) {
                    reanimacion r = new reanimacion(); //se crea objeto de clase reanimacion 
                    r.setVisible(true); //se inicia reanimacion 
                    dispose(); //se cierra clase actual
                } else if (opc.getSelectedIndex() == 1) {
                    emergencia em = new emergencia();
                    em.setVisible(true);
                    dispose();

                } else if (opc.getSelectedIndex() == 2) {
                    urgencia ur = new urgencia();
                    ur.setVisible(true);
                    dispose();
                } else if (opc.getSelectedIndex() == 3) {
                    urgenciaMenor uM = new urgenciaMenor();
                    uM.setVisible(true);
                    dispose();
                } else if (opc.getSelectedIndex() == 4) {
                    noUrgente nU = new noUrgente();
                    nU.setVisible(true);
                    dispose();
                }

            }
        };
        aceptar.addActionListener(acp);

    }

    public static void main(String[] args) {
        SistemaEmergencia sistema = new SistemaEmergencia();
        sistema.setVisible(true);
    }

}

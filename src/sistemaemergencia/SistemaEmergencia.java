package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ADRIANA,YAIR,CESAR,FRANCISCO
 */
public class SistemaEmergencia extends JFrame {
    
    JLabel sistema;
    JComboBox opc;
    JButton aceptar, consulta, PriAux;
    ImageIcon cruz, imgCon, imgPri;
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
        consulta = new JButton();
        PriAux = new JButton();
        imgCon = new ImageIcon("gifs\\llamada.png");
        imgPri = new ImageIcon("gifs\\llamada-de-emergencia.png");
        
        codigoA = new JTextField();
        opc = new JComboBox();
        aceptar = new JButton();
        cruz = new ImageIcon("gifs\\cruz-roja.png"); // DOS DIAGONALES INVERTIDAS ES PARA ESPECIFICAR LA RUTA DE LA IMAGEN
        opc.addItem("01 Reanimación");
        opc.addItem("02 Emergencia");

        /*opc.addItem("03 Urgencia");
                  opc.addItem("04 Urgencia Menor");
                  opc.addItem("05 No Urgente");*/
        opc.setBounds(270, 100, 240, 40);
        
        consulta.setBounds(490, 280, 40, 40);
        consulta.setIcon(imgCon);
        consulta.setContentAreaFilled(false);
        consulta.setBorder(null);
        consulta.setToolTipText("Funciones de administrador");
        
        codigoA.setBounds(20, 100, 240, 40);
        
        aceptar.setText("CONFIRMAR");
        aceptar.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        aceptar.setIcon(cruz);
        aceptar.setBounds(165, 200, 180, 35);
        
        PriAux.setBounds(10, 280, 40, 40);
        PriAux.setIcon(imgPri);
        PriAux.setContentAreaFilled(false);
        PriAux.setBorder(null);
        PriAux.setToolTipText("Capacitación de emergencia");
        
        this.add(opc);
        this.add(aceptar);
        this.add(codigoA);
        this.add(consulta);
        this.add(PriAux);
        
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
                    
                }
                
            }
        };
        ActionListener con = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones op = new opciones();
                op.setVisible(true);
                dispose();
                
            }
        };
        ActionListener pri = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opc = JOptionPane.showConfirmDialog(null, "Confirmar emergencia", "Confirmacion", 1);
                if (opc == 0) {
                    primerosAuxilios aux = new primerosAuxilios();
                    aux.setVisible(true);
                    dispose();
                } else if (opc == 1) {
                    SistemaEmergencia sis = new SistemaEmergencia();
                    sis.setVisible(true);
                    dispose();
                    
                } else {
                    System.out.println("Cancelado");
                }
                
            }
        };
        aceptar.addActionListener(acp);
        consulta.addActionListener(con);
        PriAux.addActionListener(pri);
        
    }
    
    public static void main(String[] args) {
        SistemaEmergencia sistema = new SistemaEmergencia();
        sistema.setVisible(true);
        
    }
    
}

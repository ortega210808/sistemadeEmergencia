package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class primerosAuxilios extends JFrame {
    
    JLabel logo;
    ImageIcon PRIAUX, ba;
    JButton VDS, RCP, HL, back;
    
    public primerosAuxilios() {
        frame();
        componentes();
        ventanasEjecutadas();
        
    }
    
    public void frame() {
        this.setTitle("PRIMEROS AUXILIOS");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(550, 350)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(550, 350)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void componentes() {
        ba = new ImageIcon("gifs\\back.png");
        back = new JButton(ba);
        VDS = new JButton("Vendajes");
        RCP = new JButton("Resucitacion Cardio Pulmonar");
        HL = new JButton("Compresión Abdominal");
        PRIAUX = new ImageIcon("C:\\Users\\javie\\Downloads\\PRIAUX2.png");
        logo = new JLabel(PRIAUX);
        
        back.setBounds(10, 270, 40, 40);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        VDS.setFont(new Font("Arial", Font.ITALIC, 12));
        VDS.setBounds(200, 30, 120, 30);
        RCP.setFont(new Font("Arial", Font.ITALIC, 12));
        RCP.setBounds(165, 90, 210, 30);
        HL.setFont(new Font("Arial", Font.ITALIC, 12));
        HL.setBounds(175, 150, 180, 30);
        
        logo.setBounds(20, 10, 100, 100);
        
        this.add(logo);
        this.add(VDS);
        this.add(RCP);
        this.add(HL);
        this.add(back);
    }
    
    private void ventanasEjecutadas() {
        ActionListener ad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vendajes ad = new vendajes();
                ad.setVisible(true);
                dispose();
            }
        };
        
        ActionListener ad1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                RCP ad = new RCP();
                ad.setVisible(true);
                dispose();
            }
        };
        ActionListener ad2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                HL ad = new HL();
                ad.setVisible(true);
                dispose();
            }
        };
        ActionListener bac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                SistemaEmergencia sis = new SistemaEmergencia();
                sis.setVisible(true);
                dispose();
            }
        };
        VDS.addActionListener(ad);
        RCP.addActionListener(ad1);
        HL.addActionListener(ad2);
        back.addActionListener(bac);
        
    }
}

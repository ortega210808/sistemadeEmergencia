package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ADRIANA,YAIR,CESAR
 */
public class emergencia extends JFrame {

    JLabel et1, et2, et3, et4;
    ImageIcon im1, im2, im3, im4, back;
    JLabel eEco;
    JButton volver;

    public emergencia() {
        frame();
        emergencias();
        acciones();
    }

    public void frame() {
        this.setTitle("EMERGENCIA");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(800, 800)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(800, 800)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void emergencias() {
        back = new ImageIcon("back.png");
        volver = new JButton(back);
        im1 = new ImageIcon("emergenciaEcologica.jpg");
        et1 = new JLabel(im1);
        eEco = new JLabel("Emergencia Ecológica");

        eEco.setBounds(40, 330, 350, 40);
        eEco.setFont(new Font("Colonna MT", Font.BOLD, 25));
        eEco.setForeground(Color.BLACK);

        volver.setBounds(10, 720, 40, 40);
        volver.setContentAreaFilled(false);
        volver.setBorder(null);

        et1.setBounds(30, 30, 300, 300);

        this.add(et1);
        this.add(eEco);
        this.add(volver);

    }

    public void acciones() {
        MouseListener ecolo = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emergenciaEcologica ecolo = new emergenciaEcologica();
                dispose();
                ecolo.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

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
        et1.addMouseListener(ecolo);
        volver.addActionListener(btnVolver);
    }
}

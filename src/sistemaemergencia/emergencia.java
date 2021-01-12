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
    ImageIcon im1, im2, im3, im4, back, inundacion;
    JLabel eEco, sismo, sismo1, inun, inun1;
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
        inundacion = new ImageIcon("gifs\\inundacion.jpg");
        inun = new JLabel(inundacion);
        inun1 = new JLabel("INUNDACIONES");
        back = new ImageIcon("gifs\\back1.png");
        volver = new JButton(back);
        im1 = new ImageIcon("gifs\\incendio.jpg");
        et1 = new JLabel(im1);
        eEco = new JLabel("INCENDIO");
        im2 = new ImageIcon("gifs\\sismo.png");
        sismo = new JLabel(im2);
        sismo1 = new JLabel("SISMO");
        inun1.setBounds(300, 650, 350, 40);
        inun1.setFont(new Font("Colonna MT", Font.BOLD, 25));
        inun1.setForeground(Color.BLACK);

        inun.setBounds(100, 400, 600, 210);
        eEco.setBounds(120, 300, 350, 40);
        eEco.setFont(new Font("Colonna MT", Font.BOLD, 25));
        eEco.setForeground(Color.BLACK);

        sismo1.setBounds(570, 300, 350, 40);
        sismo1.setFont(new Font("Colonna MT", Font.BOLD, 25));
        sismo1.setForeground(Color.BLACK);

        volver.setBounds(10, 720, 40, 40);
        volver.setContentAreaFilled(false);
        volver.setBorder(null);

        et1.setBounds(30, 30, 300, 300);
        sismo.setBounds(450, 20, 300, 300);

        this.add(et1);
        this.add(eEco);
        this.add(volver);
        this.add(sismo);
        this.add(sismo1);
        this.add(inun);
        this.add(inun1);

    }

    public void acciones() {
        MouseListener ecolo = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                incendio ecolo = new incendio();
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
        MouseListener sism = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sismo temblor = new sismo();
                dispose();
                temblor.setVisible(true);
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
        MouseListener inunda = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                inundaciones inundacio = new inundaciones();
                dispose();
                inundacio.setVisible(true);
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
        inun.addMouseListener(inunda);
        sismo.addMouseListener(sism);
        et1.addMouseListener(ecolo);
        volver.addActionListener(btnVolver);
    }
}

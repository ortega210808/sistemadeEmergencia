
package sistemaemergencia;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 80023
 */
public class emergenciaEcologica extends JFrame{
    
    public emergenciaEcologica(){
        frame();
    }
      public void frame() {
        this.setTitle("EMERGENCIA");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(800, 800)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(800, 800)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.GRAY);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

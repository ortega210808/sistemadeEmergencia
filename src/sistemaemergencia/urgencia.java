
package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class urgencia extends JFrame{
    
        public urgencia(){
            frame();
        }
        public void frame(){
        this.setTitle("URGENCIA");
        this.setResizable(false); //NI MAXIMIZAR NI MINIMIZAR 
        this.setSize(new Dimension(600, 600)); //TAMAÑO DE 500,300
        this.setMinimumSize(new Dimension(600, 600)); //TAMAÑO MÍNIMO DE 500,300
        this.getContentPane().setBackground(Color.CYAN);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

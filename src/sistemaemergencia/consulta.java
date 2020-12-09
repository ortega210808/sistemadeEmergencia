package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class consulta extends JFrame{

    public consulta(){
        frame();
    }
    public void frame() {
        this.setTitle("Consulta");
        this.setResizable(false);
        this.setSize(new Dimension(400, 400));
        this.setMinimumSize(new Dimension(400, 400));
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

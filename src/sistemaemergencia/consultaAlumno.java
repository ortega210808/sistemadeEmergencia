package sistemaemergencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;

public class consultaAlumno extends JFrame {

    //BASE DE DATOS//
    String url = "bd\\BDEmergencia"; //url de base de datos
    Connection cone;
    //

    JLabel id, nom, ap, dir, tel, num_s;
    JTextField nom1, ap1, dir1, tel1, num_s1, matr;
    JButton Ok, limpiar, h;
    ImageIcon home;

    public consultaAlumno() {
        frame();
        contenido();
        bloquearCampos();
        consultaAlumno();
        regresar();
        limpiar();
    }

    public void conexion() {
        try {
            cone = DriverManager.getConnection("jdbc:sqlite:" + url); //lineas que inician la conexion
            if (cone != null) {
                System.out.println("BD: ON"); //MUESTRA EL MENSAJE DE QUE ESTA CONECTADA
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage()); //MANDA ERROR POR SI NO SE CONECTA
        }
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

    public void contenido() {
        home = new ImageIcon("gifs\\back.png");
        h = new JButton(home);
        h.setBounds(10, 320, 40, 40);
        h.setContentAreaFilled(false);
        h.setBorder(null);

        matr = new JTextField("");
        Ok = new JButton("Consulta");
        limpiar = new JButton("Limpiar");

        id = new JLabel("Matrícula:");
        nom = new JLabel("Nombre:");
        ap = new JLabel("Apellidos:");
        dir = new JLabel("Dirección:");
        tel = new JLabel("Telefono de contacto:");
        num_s = new JLabel("Numero de seguro:");

        nom1 = new JTextField("");
        ap1 = new JTextField("");
        dir1 = new JTextField("");
        tel1 = new JTextField("");
        num_s1 = new JTextField("");

        id.setBounds(20, 20, 100, 35);
        nom.setBounds(20, 50, 100, 35);
        ap.setBounds(20, 80, 100, 35);
        dir.setBounds(20, 110, 100, 35);
        tel.setBounds(20, 140, 150, 35);
        num_s.setBounds(20, 170, 160, 35);

        nom1.setBounds(100, 50, 100, 30);
        ap1.setBounds(100, 80, 100, 30);
        dir1.setBounds(100, 110, 200, 30);
        tel1.setBounds(150, 140, 100, 30);
        num_s1.setBounds(140, 170, 100, 30);
        matr.setBounds(100, 20, 100, 30);

        Ok.setBounds(100, 300, 100, 30);
        limpiar.setBounds(250, 300, 100, 30);

        this.add(Ok);
        this.add(limpiar);

        this.add(matr);
        this.add(id);
        this.add(nom);
        this.add(ap);
        this.add(dir);
        this.add(tel);
        this.add(num_s);

        this.add(nom1);
        this.add(ap1);
        this.add(dir1);
        this.add(tel1);
        this.add(num_s1);
        this.add(h);

    }

    public void consultaAlumno() {
        ActionListener consulta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexion();
                ResultSet result = null; //LINEA QUE HARÁ LA CONSULTA
                if (matr.getText().equals("191090001")) {
                    try {

                        PreparedStatement st = cone.prepareStatement("select * from alumno where matricula=191090001");
                        PreparedStatement st1 = cone.prepareStatement("select * from contacto where idContacto=1");
                        PreparedStatement st2 = cone.prepareStatement("select * from historialClinico where idHistorial=1");
                        result = st.executeQuery();
                        while (result.next()) {
                            matr.setText(result.getString("matricula"));
                            nom1.setText(result.getString("nombre"));
                            ap1.setText(result.getString("apellido"));
                            dir1.setText(result.getString("direccion"));
                        }
                        result = st1.executeQuery();
                        while (result.next()) {
                            tel1.setText(result.getString("telefono"));
                        }
                        result = st2.executeQuery();
                        while (result.next()) {
                            num_s1.setText(result.getString("numerodeSeguro"));
                        }
                    } catch (Exception x) {
                        System.err.println("Error en la consulta\n" + x.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El dato no existe en la base de datos");
                }

            }
        };
        Ok.addActionListener(consulta);
    }

    public void borrarDato() {
        ActionListener borrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexion();
                ResultSet result = null;
                if (matr.getText().equals("191090001")) {
                    try {
                        PreparedStatement stam = cone.prepareStatement("Delete * from matricula=191090001");
                        result = stam.executeQuery();

                    } catch (Exception x) {
                        System.err.println("Error en la consulta\n" + x.getMessage());
                    }
                }
            }
        };
    }

    public void limpiar() {
        ActionListener limp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                matr.setText("");
                nom1.setText("");
                ap1.setText("");
                dir1.setText("");
                tel1.setText("");
                num_s1.setText("");
            }
        };

        limpiar.addActionListener(limp);
    }

    public void bloquearCampos() {
        nom1.setEnabled(false);
        ap1.setEnabled(false);
        tel1.setEnabled(false);
        dir1.setEnabled(false);
        num_s1.setEnabled(false);
    }

    public void regresar() {
        ActionListener ho = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcionConsulta con = new opcionConsulta();
                con.setVisible(true);
                dispose();
            }
        };
        h.addActionListener(ho);
    }

}

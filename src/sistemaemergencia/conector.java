package sistemaemergencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conector {

    String url = "bd\\Proyecto5to.db";
    Connection cone;

    public void connect() {
        try {
            cone = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (cone != null) {
                System.out.println("Base de datos conectada");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
    }

    public void close() {
        try {
            cone.close();
        } catch (SQLException ex) {
            Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

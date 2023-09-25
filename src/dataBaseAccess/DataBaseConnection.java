
package dataBaseAccess;

import java.sql.*;
import javax.swing.JOptionPane;

public class DataBaseConnection {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "UniversidadULP";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private DataBaseConnection() {} // Constructor vacio.
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USERNAME, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "El driver de conexión no fue encontrado. " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "La conexión con la base de datos ha fallado. " + ex.getMessage());
            }
        }
        return connection;
    }
}

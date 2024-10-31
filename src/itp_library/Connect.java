package itp_library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static final String url = "jdbc:mysql://localhost:3306/libreria"; 
    private static final String user = "root"; // Usuario de MySQL
    private static final String pass = "12345"; // Contraseña de MySQL
    private static Connection conn = null;
    public Connect(){
        conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            
            // Connect?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}

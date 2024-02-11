/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fc211026_specialLabsheet;

/**
 *
 * @author menur
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {

    /**
     * @param args the command line arguments
     */
    
    public static void createNewDatabase(String fileName) throws ClassNotFoundException { 
        String url = "jdbc:sqlite:D:/sqlite/" + fileName; 
        try { 
            Class.forName("org.sqlite.JDBC"); 
            Connection conn = DriverManager.getConnection(url); 
            if (conn != null) { 
                DatabaseMetaData meta = conn.getMetaData(); 
                System.out.println("The driver name is " + meta.getDriverName()); 
                System.out.println("A new database has been created."); 
            } 
            conn.close();
        } catch (SQLException e) { 
            System.out.println(e.getMessage()); 
        } 
    }     
}

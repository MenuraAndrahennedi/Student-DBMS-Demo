/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fc211026_specialLabsheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author menur
 */
public class ConnectDatabase {

    /**
     * @param args the command line arguments
     */
    
    public static Connection getConnection(){
        Connection conn=null;
        String url="jdbc:sqlite:D:/sqlite/studentDetails.db";
        
        try{
            conn=DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

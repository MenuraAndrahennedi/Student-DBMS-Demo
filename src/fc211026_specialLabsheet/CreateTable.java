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
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {

    /**
     * @param args the command line arguments
     */
    
    public static void createNewTable(){
        String sql = "CREATE TABLE IF NOT EXISTS Students_Details (\n"
        + " Index_Num VARCHAR(8) PRIMARY KEY,\n"
        + " Name text NOT NULL,\n"
        + " Subject_01 text NOT NULL,\n"
        + " Subject_02 text NOT NULL,\n"
        + " Subject_03 text NOT NULL,\n"
        + " Current_GPA double NOT NULL );";
        
        try{
            Connection conn=ConnectDatabase.getConnection();
            Statement statement=conn.createStatement();
            statement.execute(sql);
            System.out.println("Student_Details Table created.");
            conn.close();
        }catch (SQLException e){
            System.out.println("Student_Details Table is exsisted.");
            System.out.println(e.getMessage());
        }
    }
}

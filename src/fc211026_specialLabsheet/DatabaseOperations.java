/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fc211026_specialLabsheet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author menur
 */
public class DatabaseOperations {
    
    public static boolean insertData(String index_Num, String name, String subject_01, String subject_02, String subject_03, String current_GPA){
        String insertSQL="INSERT INTO Students_Details(Index_Num,Name,Subject_01,Subject_02,Subject_03,Current_GPA) VALUES(?,?,?,?,?,?)";
        
        try{
            Connection conn=ConnectDatabase.getConnection();
            PreparedStatement p_Statement=conn.prepareStatement(insertSQL);
            p_Statement.setString(1, index_Num);
            p_Statement.setString(2, name);
            p_Statement.setString(3, subject_01);
            p_Statement.setString(4, subject_02);
            p_Statement.setString(5, subject_03);
            p_Statement.setString(6, current_GPA);
            p_Statement.executeUpdate();
            conn.close();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static String[] retrievetData(String index_Num){
        String retrieveSQL = "SELECT * FROM Students_Details WHERE Index_Num = '"+index_Num+"'";
        String[] resultData=new String[5];
        try{
            Connection conn =ConnectDatabase.getConnection();
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery(retrieveSQL); 
            resultData[0]= result.getString("Name");
            resultData[1]= result.getString("Subject_01");
            resultData[2]= result.getString("Subject_02");
            resultData[3]= result.getString("Subject_03");
            resultData[4]= result.getString("Current_GPA");
            conn.close();
            return resultData;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static void updateData(String index_Num, String GPA){
        String updateGPASQL="UPDATE Students_Details SET Current_GPA = ? WHERE Index_Num = ?";
        try{
            Connection conn=ConnectDatabase.getConnection();
            PreparedStatement p_Statement=conn.prepareStatement(updateGPASQL);
            p_Statement.setString(1, GPA);
            p_Statement.setString(2, index_Num);
            p_Statement.executeUpdate();
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdm.resturant;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Noor
 */
public class Javaconnection {
    Connection conn = null;
    
    public static Connection ConnectDb(){
     try{    
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4I3PL3F\\SQLEXPRESS:1433;databaseName=Resturant","sa","sap");
        return conn;
    }
     catch(Exception e){
         
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
    }       
    
}

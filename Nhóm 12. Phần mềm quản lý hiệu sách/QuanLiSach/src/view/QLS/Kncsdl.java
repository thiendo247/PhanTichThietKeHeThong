/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.QLS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Admin
 */
public class Kncsdl {
    
        public static Connection getConnection(){
        Connection conn = null;
try {
   
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/quanlisach";
    String user      = "root";
    String password  = "";
     
     
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...  
   
} catch(SQLException e) {
   System.out.println(e.getMessage());
} 
    
        return conn;
    
    }
}

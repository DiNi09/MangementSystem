/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WHTNiroshika
 */
public class ConnectionProvider {
    
    public static Connection getConn(){
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/C_Management";
            String uname = "root";
            String password = "thilani";
            
            
            Connection con1 = DriverManager.getConnection(url,uname,password);
            
            return con1;
            
            
        }
        
        catch(Exception e)
        {
            
         return null;   
        }
        
    }
    
    
}

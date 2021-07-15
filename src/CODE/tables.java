/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WHTNiroshika
 */
public class tables {
    
    public static void main(String[] args)
   {
    
    
       Connection con1 = null;
       Statement st = null;
       
       try{
            con1 = ConnectionProvider.getConn(); //create a connection
            st=con1.createStatement();
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))"); //create tables
            
         
            JOptionPane.showMessageDialog(null, "Table Created Successfully"); //Show message "table created successfully"
            
            
            
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);//Display message
       }
       finally //In case of failure
       {
           try{
               
               con1.close();//close connection
               st.close(); //close statement
               
               
           }catch(Exception e){
               
           }
           
           
           
           
           
       }
   }
}
    
    
    


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
public class InsertUpdateDelete {
    
     public static void setData(String Query,String msg) //pass query and msg
    {
        Connection con1 = null; //Create connection
        Statement st=null; //Create statement
        
        try{
            
            con1 = ConnectionProvider.getConn(); //connection provider class
            st = con1.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg); //dont display any message
            
        }catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally
        {
            try{
            
            
        }catch(Exception e)
        {
            
        }
            
        }
        
    }
    
}

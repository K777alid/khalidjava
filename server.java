Main server:
public class maincerver21s21080 {
    public static void main(String args[])
    {
     cerver21s21080 k7alid8=new cerver21s21080(); 
     
     Thread k7t=new  Thread(k7alid8);
     k7t.start();
    }
}
server:

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class cerver21s21080 implements Runnable
{
    public void run()
    {
        try{
         
            String kk7host="jdbc:derby://localhost:1527/k7alid";
            String kk7name="khalid";
            String kk7pass="54321";
            
            Connection kk7alid=DriverManager.getConnection(kk7host, kk7name, kk7pass);
            
            ServerSocket k7alid77=new ServerSocket(5689);
            System.out.println("Server working");
            
            
            while(true){
                Socket k7alids = k7alid77.accept();
               
                DataInputStream khdiss=new DataInputStream( k7alids.getInputStream());
                int khcode = khdiss.readInt();
                int khrq = khdiss.readInt();
                 
                System.out.println("The code is:"+khcode);
                System.out.println("The kk:"+khrq);
                
                Statement kkk7alid=kk7alid.createStatement();
         
                String kkkk7alid="SELECT * FROM K7A WHERE KCODE"+khcode;
                
                ResultSet k7alid777= kkk7alid.executeQuery(kkkk7alid);
                
                DataOutputStream khdoss=new DataOutputStream( k7alids.getOutputStream());
                        
                while(k7alid777.next())
                {
                    
               String khname= k7alid777.getString("KNAME");
               
                double kk7kk=  k7alid777.getDouble("KPRICE");
                double khprice= khrq*kk7kk;
             
                
                khdoss.writeUTF( khname);
                khdoss.writeDouble(khprice);
               System.out.println("Send to the cliet");
               
               
            }
            }
        } 
        catch (IOException | SQLException ex) {
            Logger.getLogger(cerver21s21080.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}

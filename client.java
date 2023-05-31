Main client:
public class mainclient21s21080 {
    
   public static void main(String args[])
   {
    client21s21080 khalid=new client21s21080();
   Thread k7alid=new Thread(khalid);
   k7alid.start();

   }
   
}

Client:
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class client21s21080 implements Runnable 
{
    public void run()
    {
        try{
            Socket k7alids=new Socket("localhost",6440);
            
            
            Scanner k7alidw=new Scanner(System.in);
            System.out.println("Enter cobr:");
            int khcode=k7alidw.nextInt();
            System.out.println("Enter the rq");
            int khrq=k7alidw.nextInt();
           
            
            DataOutputStream khdos=new DataOutputStream( k7alids.getOutputStream());
            khdos.writeInt(khcode);
            khdos.writeInt(khrq);
           
            
            DataInputStream khdis=new DataInputStream( k7alids.getInputStream());
            String khname=khdis.readUTF();
            double khprice=khdis.readDouble();
             System.out.println("The Name s:"+khname);
             System.out.println("pris is"+khprice);
                    
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
} 

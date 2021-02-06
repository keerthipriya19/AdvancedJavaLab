package networking;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Testserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ServerSocket ss=new ServerSocket(1090);
		Socket s=ss.accept();
		DataInputStream ob=new DataInputStream(s.getInputStream());		
		 String original=ob.readLine();
		PrintStream out=new PrintStream(s.getOutputStream());
	 String reverse="";
		int n=original.length();  
	      for ( int i = n - 1; i >= 0; i-- )  
	      {
	         reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse))
	      {
	         out.println("Entered string is a palindrome.");  
	      }
	      else  
	      {
	         out.println("Entered string isn't a palindrome."); 
	      }
	      out.close();
	      ss.close();
	      s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

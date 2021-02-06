package networking;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcpserver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		ServerSocket ss=new ServerSocket(1067);
		Socket s=ss.accept();
		DataInputStream ob=new DataInputStream(s.getInputStream());		
		 String original=ob.readLine();
		PrintStream out=new PrintStream(s.getOutputStream());
		int n=original.length();  
		String reverse=new StringBuffer(original).reverse().toString();
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

package networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server  {
	public static void main(String args[])throws IOException
	   {  
		  ServerSocket ss=new ServerSocket(77);
		   Socket s=ss.accept();	
		   Scanner in=new Scanner(s.getInputStream());
		   String original=in.nextLine();
		   String reverse="";
		   int n=original.length();  
	      for ( int i = n - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome."); 
	      PrintStream ps=new PrintStream(s.getOutputStream());
	    //  ps.println(original);
	      ps.close();
	      ss.close();
	      s.close();
        
	   }
}
	
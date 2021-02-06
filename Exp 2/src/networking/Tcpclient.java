package networking;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Tcpclient {
	public static void main(String args[]) 
	{
		try {
	Socket s=new Socket("localhost",1067);
	System.out.println("Enter a  string: ");
	Scanner i = new Scanner(System.in);
	String str = i.nextLine();
	DataInputStream in=new DataInputStream(s.getInputStream());
	PrintStream ps=new PrintStream(s.getOutputStream());
	ps.println(str);
	System.out.println(in.readLine());
	ps.close();
	s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}

package networking;

import java.io.BufferedReader;
import java.io.DataInputStream;

import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Testclinet {
	public static void main(String args[]) 
	{
		try {
	Socket s=new Socket("localhost",1090);
	System.out.println("Enter a  string: ");
	Scanner i = new Scanner(System.in);
	String str = i.nextLine();
	DataInputStream in=new DataInputStream(s.getInputStream());
	PrintStream ps=new PrintStream(s.getOutputStream());
	ps.println(str);
	System.out.println("Response from server=" + in.readLine());
	ps.close();
	s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}

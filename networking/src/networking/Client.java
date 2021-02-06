package networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String args[]) throws Exception
	{
	Scanner sc=new Scanner(System.in);	
	Socket s=new Socket("localhost",1060);
	
	Scanner in=new Scanner(s.getInputStream());
	System.out.println("Enter a string");
	String k=sc.nextLine();
	PrintStream ps=new PrintStream(s.getOutputStream());
	ps.println(k);
	String ke=in.nextLine();
	System.out.println("Response from server"+ke);
	
	ps.close();
	s.close();
	}
	
}

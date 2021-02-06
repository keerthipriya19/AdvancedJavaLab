package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Classserver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket soc=new Socket("localhost",2099);
		PrintStream out=new PrintStream(soc.getOutputStream());
		out.println("hi i am srever");
		DataInputStream ij=new DataInputStream(soc.getInputStream());
		System.out.println("server"+ij.readLine());
		soc.close();
		

	}

}

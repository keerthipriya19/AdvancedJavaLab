package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Classclient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket seroc=new ServerSocket(2099);
		Socket soc=seroc.accept();
		DataInputStream in=new DataInputStream(soc.getInputStream());
		System.out.println("clinet"+in.readLine());
		PrintStream out=new PrintStream(soc.getOutputStream());
		out.println("hi i am clinet "+new Date().toString());
		soc.close();
		

	}

}

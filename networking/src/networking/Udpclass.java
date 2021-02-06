package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Udpclass {
	public static void main(String[] args) {
		try {
		InetAddress ia=InetAddress.getLocalHost();
		DatagramSocket ds=new DatagramSocket(1024,ia);
		String x="hello server";
		byte[] b=x.getBytes();
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,83);
		ds.send(dp);
		System.out.println("sending to server"+(new String(b)));
		byte[] buff=new byte[50];
		DatagramPacket in=new DatagramPacket(buff,buff.length);
		ds.receive(in);
		System.out.println("received from server"+(new String(buff)));
		ds.close();
		}
		catch(SocketException se) {
			System.out.println(se);
			
		}
		catch(IOException ie) {
			System.out.println(ie);
			
		}
	}

}

package networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Udpserver {
	public static void main(String[] args) {
	try {
		DatagramSocket ds=new DatagramSocket(83);
		byte[] b=new byte[50];
		DatagramPacket in=new DatagramPacket(b,b.length);
		ds.receive(in);
	//	System.out.println((new String(b)));
		String x="hello clinet";
		byte[] buff=x.getBytes();
		DatagramPacket out=new DatagramPacket(buff,buff.length,in.getAddress(),in.getPort());
		ds.send(out);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

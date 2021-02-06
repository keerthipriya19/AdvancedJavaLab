package networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Udpserver {
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(76);
			byte[] b=new byte[50];
			DatagramPacket in=new DatagramPacket(b,b.length);
			ds.receive(in);
			 String original=new String(b);
			 String a=original.substring(0,in.getLength()); 
			     String ans= palindrome(a);			    	 
			      byte buff[]=ans.getBytes();
					DatagramPacket out=new DatagramPacket(buff,buff.length,in.getAddress(),in.getPort());
					ds.send(out);
			      
			      ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
	public  static String palindrome(String a) {
		 int n=a.length();  
		 String reverse=new StringBuffer(a).reverse().toString();
	      if (a.equals(reverse))
	      {
	    	  return " Entered string is palindrome";
	      }
	      else  
	      {
	    	  return " Entered string is not a palindrome";
	      } 
	     
		
   	  
     }

}

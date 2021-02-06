//RMI Server

import java.rmi.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements Amicable {

	public RMIServer() throws RemoteException {
		super();
	}

	public String amicable(int a, int b) throws RemoteException {
		int s1 = 0, s2 = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0)
                    s1 += i;
            }
            for (int i = 1; i < b; i++) {
                if (b % i == 0)
                    s2 += i;
            }
            if (s1 == b && s2==a){
               return  "These numbers are amicable.";
            }
            else{
                return "These numbers are not amicable.";
            }
		
	}

	public static void main(String args[]) throws Exception {
		RMIServer server = new RMIServer();
		System.out.println("RMI server is running");
		Naming.rebind("Amicableserver", server);
	}
}
//Interface file

import java.rmi.*;

public interface Multiplication extends Remote {
	//declaring abstract method
	public String amicable(int a,int b) throws RemoteException;
}
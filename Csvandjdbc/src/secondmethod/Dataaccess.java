package secondmethod;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVReader;

public class Dataaccess {
	
	public void salrange(ArrayList<User> usersList, int minvalue, int maxvalue) {
		// TODO Auto-generated method stub
		int c=0;
		for(User usr:usersList){
			int i=Integer.parseInt(usr.empsal);
			
			if(i>=minvalue && i<=maxvalue) {
				c++;					
				System.out.println(usr.getEmpname());
			}
							
		}
		System.out.println("Count of employees within given range of salary is: "+c);
		
	}
	 public void givensalary(ArrayList<User> usersList, int cmpsal) {
		// TODO Auto-generated method stub
		int count=0;
		int m=0;
		for(User i:usersList){
			int sal=Integer.parseInt(i.empsal);
			if(cmpsal==sal) {
				count++;
				System.out.println(i.getEmpname());
			}
		}
		System.out.println("Total number of employees with given salary: "+count);
		
	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Dataaccess ob=new Dataaccess();
			CSVReader reader;
			ArrayList<User> usersList=new ArrayList<User>();
			try{
				reader = new CSVReader(new FileReader("./empdata.csv"));
				String[] newSt;			
				while((newSt=reader.readNext())!=null){
					User user = new User();
					user.setEmpname(newSt[0]);
					user.setEmpsal(newSt[1]);
					   usersList.add(user);					
				}
				Scanner sc= new Scanner(System.in);    
				System.out.print("Enter min salary- ");  
				int minvalue= sc.nextInt(); 
				System.out.print("Enter max salary- ");  
				int maxvalue= sc.nextInt();
				ob.salrange(usersList,minvalue,maxvalue);
				System.out.print("Enter salary to get employee name: "); 
				int cmpsal=sc.nextInt();
				ob.givensalary(usersList,cmpsal);
							
				
			}
			catch(Exception e){
				System.out.println(e);
			}
	 }
}

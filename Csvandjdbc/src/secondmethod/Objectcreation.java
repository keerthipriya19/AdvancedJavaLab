package secondmethod;
import java.util.ArrayList;
import java.util.Scanner;
public class Objectcreation {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empretriving  emp=new Empretriving();
		
		// Create readfromcsvfile object
		
		// call readfromcsvfile() and get arraylist object
		ArrayList list1=emp.reademp();
		
		// create object from dboperation object
		Jdbc db=new Jdbc();
		
		
		
		/*// call insertRows() by passing arraylist object and get integer and display no of rows inserted done.
		int a=db.datainserting(list1);
		System.out.println(a);
		
		// call selectquery() to display query results
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min sal - ");
		String minsal = sc.nextLine();
		System.out.println("Enter max sal - ");
		String maxsal = sc.nextLine();
		db.rangecount(minsal,maxsal);
		*/
		
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary to get employee name: ");
		String salary = sc.nextLine();
		db.empname(salary);
	
	
		
		
	}

}



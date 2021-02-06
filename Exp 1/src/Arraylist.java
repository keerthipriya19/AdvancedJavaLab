import java.util.ArrayList;

public class Arraylist {

	public  static void main(String args[]) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Keerthi");
		ob.add("Divya");
		ob.add("Nitya");
		System.out.println("Currently the arraylist has following elements:"+ob);
		ob.add(1,"Rajia");
		ob.add(2,"Ramya");
		ob.remove("Sravani");
		System.out.println("Currently the arraylist has following elements:"+ob);

	}

}

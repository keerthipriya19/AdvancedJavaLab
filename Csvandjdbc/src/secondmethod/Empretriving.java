package secondmethod;

import java.io.FileReader;

import java.util.ArrayList;

import com.opencsv.CSVReader;



public class Empretriving {

	public ArrayList reademp(){
		// TODO Auto-generated method stub
		CSVReader reader;
		ArrayList<Emppojo> usersList=new ArrayList<Emppojo>();
		try{
			reader = new CSVReader(new FileReader("./empdata.csv"));
			String[] newSt;			
			while((newSt=reader.readNext())!=null){
				Emppojo user = new Emppojo();
				user.setEmpname(newSt[0]);
				user.setEmpsal(newSt[1]);
				   usersList.add(user);					
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return usersList;
 }
}




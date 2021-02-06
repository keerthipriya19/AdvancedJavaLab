package secondmethod;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Jdbc {

	public Connection getDBConnection(){
		Connection con=null;
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void closeDBConnection(Connection con){
		try
        {
            con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	/*
	public int datainserting(ArrayList list){
		int rows=0;
		try{
			Connection con=getDBConnection();
			//create insert query relevent to your application with ? instead of values 
			String query="insert into emp1 values(?,?)";
			
			PreparedStatement premt=con.prepareStatement(query);
			
			// Create object of Iterator from ArrayList and then iterate through
			
			Iterator<User> it=list.iterator();
			
			while(it.hasNext()){
				// Create POJO object from it.next
			 User object=it.next();
				// call setXXX() methods to set the values with the values of POJO class members by calling its getter in place of each ?
				
				premt.setString(1, object.getEmpname());
				premt.setString(2, object.getEmpsal());
				
				
				rows=premt.executeUpdate();
			}
	      closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
		return rows;
 }*/
 
/*
	// define selectqueryN () for each select query in the problem statement. 
	public void rangecount(String minsal,String maxsal)
	// Parameter list as per your requirement to set the values into select query
	{
		try{
			// prepare select query relevant to your requirement with ? .
			String query="select count(empname) from emp1 where empsal Between ? And ?";
			Connection con=getDBConnection();
			PreparedStatement psm=con.prepareStatement(query);
			
			// call psmt.setXXX() methods to set the values into all ? in query.
			psm.setString(1,minsal);
			psm.setString(2,maxsal);
			// execute query
			ResultSet rs=psm.executeQuery();
			
			// Iterate rs to show results of query
			while(rs.next()) {
				System.out.println("count: "+rs.getString(1));
			}
			
			closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	*/
	

	public void empname(String salary)
	// Parameter list as per your requirement to set the values into select query
	{
		try{
			// prepare select query relevant to your requirement with ? .
			String query="select empname from emp1 where empsal=?";
			Connection con=getDBConnection();
			PreparedStatement psmt=con.prepareStatement(query);
			
			// call psmt.setXXX() methods to set the values into all ? in query.
			psmt.setString(1,salary);
			// execute quey
			ResultSet rs=psmt.executeQuery();
			
			// Iterate rs to show results of query
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	}
		
	
	
		
	






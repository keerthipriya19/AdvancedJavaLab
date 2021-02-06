package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class create {
	public static void main(String[] args) {
		try {
		//load the jdbc driver-4 into application for mysql.
		Class.forName("com.mysql.jdbc.Driver");

		//establish the connection.
		//DriverManager.getConnection(connecctionURL,username,password)

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		Statement stmt=con.createStatement();
		String sql = "CREATE TABLE f " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER )" 
               ; 

   stmt.executeUpdate(sql);
   System.out.println("Created table in given database...");
   String query="insert into f values(?,?,?,?)";
	PreparedStatement psmt=(PreparedStatement) con.prepareStatement(query);

	psmt.setString(1, "90");
	psmt.setString(2, "hasini");
	psmt.setString(3, "roia");
	psmt.setString(4, "7");
	int rows=psmt.executeUpdate();
	//retrive the data from resultset.

	System.out.println(rows+"row(s) are updated.");
	String quer="update f set age=? where id=?";
	PreparedStatement plsmt=(PreparedStatement) con.prepareStatement(quer);

	plsmt.setString(1, "70");
	plsmt.setString(2, "90");
	
	int rowls=plsmt.executeUpdate();
	System.out.println("yes updated");
	Statement stmlt =con.createStatement();
	ResultSet rsa=stmlt.executeQuery("select * from f");


	System.out.println("empno\tename\tsal\tdept");
	while(rsa.next()) {
	System.out.println(rsa.getString(1)+"\t"+rsa.getString(2)+"\t"+rsa.getString(3)+"\t"+rsa.getString(4));

	}
		con.close();

		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}

		}





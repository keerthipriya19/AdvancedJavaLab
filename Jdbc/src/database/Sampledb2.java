package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Sampledb2 {



	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
	//load the jdbc driver-4 into application for mysql.
	Class.forName("com.mysql.jdbc.Driver");

	//establish the connection.
	//DriverManager.getConnection(connecctionURL,username,password)

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
	//statement object creation.
	//insert
	//String query="insert into jd values(?,?,?,?)";
	//PreparedStatement psmt=(PreparedStatement) con.prepareStatement(query);

	//psmt.setString(1, "18");
	//psmt.setString(2, "hasini");
	//psmt.setString(3, "80000");
	//psmt.setString(4, "admin");
	
	//update
	//String query="update jd set empname=? where dept=?";
	//del
	String query="delete from jd where empsal=?";
	PreparedStatement upsmt=(PreparedStatement) con.prepareStatement(query);

	upsmt.setString(1, "10000");
	



	//execution of sql statement.output is table which is reperesented as resultset in application.
	//int rows=psmt.executeUpdate();
	int rows=upsmt.executeUpdate();
	//retrive the data from resultset.

	System.out.println(rows+"row(s) are updated.");
	Statement stmt =con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from jd");


	System.out.println("empno\tename\tsal\tdept");
	while(rs.next()) {
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));

	}
	con.close();

	} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}
}

	



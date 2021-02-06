package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Firstservlet
 */
@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String pname=request.getParameter("personname");
		String password=request.getParameter("password");
        String gender=request.getParameter("gender");
		String sems[]=request.getParameterValues("sems");
		ArrayList list=new ArrayList(Arrays.asList(sems));
		 String dob=request.getParameter("dob");
		 
		 
		 out.println("<table border=1>");
		 out.println("<tr>");
		 out.println("<td>Person name</td>");
		 out.println("<td>"+pname+"</td>");
		 out.println("</td>");
		 
		 out.println("<tr>");
		 out.println("<td>Password</td>");
		 out.println("<td>"+password+"</td>");
		 out.println("</td>");
		 
		 out.println("<tr>");
		 out.println("<td>Gender</td>");
		 out.println("<td>"+gender+"</td>");
		 out.println("</td>");
		 
		 out.println("<tr>");
		 out.println("<td>sems</td>");
		 out.println("<td>"+sems.toString()+"</td>");
		 out.println("</td>");
		 
		
		 
		 out.println("<tr>");
		 out.println("<td>DOB</td>");
		 out.println("<td>"+dob+"</td>");
		 out.println("</td>");
		  out.println("</table>");
		
	}

}

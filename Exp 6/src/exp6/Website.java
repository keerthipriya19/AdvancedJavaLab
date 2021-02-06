package exp6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Website
 */
@WebServlet("/Website")
public class Website extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Website() {
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
		PrintWriter out = response.getWriter();
		
		String website = request.getParameter("onlinewebsites");
		
		if( website.equals("myntra")) {
			response.sendRedirect("https://www.myntra.com");
		}
		else if( website.equals("amazon")) {
			response.sendRedirect("https://www.amazon.com");
		}
		else if( website.equals("Ajio")) {
			response.sendRedirect("https://www.ajio.com");
		}
		else if( website.equals("Flipkart")) {
			response.sendRedirect("https://www.flipkart.com");
		}
		else if( website.equals("snapdeal")) {
			response.sendRedirect("https://www.snapdeal.com");
		}
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessCustomer
 */
@WebServlet("/Lookup")
public class ProcessCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessCustomer() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int custId = Integer.parseInt(request.getParameter("custid"));
		//System.out.print("The customer id is ");
		//System.out.println(custId);
		
		
		String nextURL = "/output.jsp";
		String message = "The customer id is " + custId;
		
		request.setAttribute("message", message);
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		
	}

}

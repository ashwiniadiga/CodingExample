package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("ashwini") && pass.equals("test")){
			session.setAttribute("userName", uname);
			response.sendRedirect("welcome.jsp");
			
		}else{
			response.sendRedirect("login.jsp");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}

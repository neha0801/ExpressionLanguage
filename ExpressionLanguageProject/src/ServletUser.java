

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/ServletUser")
public class ServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser() {
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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age=Integer.parseInt(request.getParameter("age"));
		String add = request.getParameter("add");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		
		Address addObj = new Address();
		User userObj = new User();
		userObj.setAge(age);
		userObj.setEmail(email);
		userObj.setName(name);
		
		addObj.setStreetAddress(add);
		addObj.setCity(city);
		addObj.setState(state);
		addObj.setZipcode(zipcode);
		
		userObj.setAddObj(addObj);
		HttpSession session = request.getSession();
		session.setAttribute("user", userObj);
		request.getServletContext().getRequestDispatcher("/User.jsp").forward(request, response);
	}

}

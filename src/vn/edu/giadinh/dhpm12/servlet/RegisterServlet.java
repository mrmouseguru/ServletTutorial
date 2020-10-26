package vn.edu.giadinh.dhpm12.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");

		//ServletOutputStream out = response.getOutputStream();

		String userName = request.getParameter("username");
		String email = request.getParameter("email");

		/*
		 * out.println("<html>"); out.println("<head><title>Register</title></head>");
		 * 
		 * out.println("<body>"); out.println("<h3>Register Information</h3>");
		 * out.println("<p>User Name = " + userName + "</p>"); out.println("<p>Email = "
		 * + email + "</p>"); out.println("</body>"); out.println("<html>");
		 */

		request.setAttribute("userName", userName);
		request.setAttribute("email", email);

		RequestDispatcher dispatcher = request
				.getServletContext()
				.getRequestDispatcher("/forwardServlet");

		dispatcher.forward(request, response);

		// response.sendRedirect(request.getContextPath() + "/showInform.html");

		//
		// request.getRequestDispatcher("");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

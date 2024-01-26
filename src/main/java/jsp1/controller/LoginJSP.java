package jsp1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jsp1")
public class LoginJSP extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email!=null&& password!=null) {
			req.setAttribute("message", email);
			RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
			
		  	
			 
			 
			
		}
	}

}

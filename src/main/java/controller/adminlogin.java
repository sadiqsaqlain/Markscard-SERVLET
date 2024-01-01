package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LecturesDao;

@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		if(email.equals("admin")&&pwd.equals("12345"))
		{
			
			req.getRequestDispatcher("adminopt.jsp").include(req, resp);
		}
		else
		{
			resp.getWriter().print("<h1>Invalid User_Name or password please try again");
			req.getRequestDispatcher("adminlogin.jsp").include(req, resp);

		}
	}
}

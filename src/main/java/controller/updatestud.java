package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentsDao;

@WebServlet("/updatestud")
public class updatestud extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn=req.getParameter("usn");
		
		StudentsDao s=new StudentsDao();
		req.setAttribute("stud", s.fetch(usn));
		req.getRequestDispatcher("updatestud.jsp").include(req, resp);
	}
}

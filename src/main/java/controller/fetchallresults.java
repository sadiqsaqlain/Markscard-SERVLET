package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentsDao;

@WebServlet("/fetchallresults")
public class fetchallresults extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentsDao s=new StudentsDao();
		req.setAttribute("stud", s.fetchall());
		req.getRequestDispatcher("fetchallresults.jsp").include(req, resp);
	}
}

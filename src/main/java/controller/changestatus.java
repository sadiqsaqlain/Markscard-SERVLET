package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LecturesDao;
import Dto.Lectures;

@WebServlet("/changestatus")
public class changestatus extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	LecturesDao l=new LecturesDao();
	Lectures ll=l.fetch(email);
	if(ll.isStatus())
	{
		ll.setStatus(false);
	}
	else
	{
		ll.setStatus(true);
	}
	l.update(ll);
	req.setAttribute("lect",l.fetchall());
	req.getRequestDispatcher("Alllectures.jsp").include(req, resp);
	}
}

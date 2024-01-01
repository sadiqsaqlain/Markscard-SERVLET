package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LecturesDao;
import Dto.Lectures;

@WebServlet("/lecturelogin")
public class lecturesignin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		LecturesDao l=new LecturesDao();
		if(l.fetch(email)==null)
		{
			resp.getWriter().print("<h1>Account not exists please create<h1>");
			req.getRequestDispatcher("createlecture.jsp").include(req, resp);
		}
		else
		{
			Lectures ll=l.fetch(email);
			if(ll.isStatus())
			{
				if(ll.getPwd().equals(pwd))
				{
				req.getSession().setAttribute("lec", ll);
				req.getRequestDispatcher("insertmarks.jsp").include(req, resp);
				}
				else
				{
					resp.getWriter().print("<h1>incorrect Password");
					req.getRequestDispatcher("lecturelogin.jsp").include(req, resp);
				}
			}
			else
				{
				resp.getWriter().print("<h1>Account not yet been approved by admin<h1>");

			}
		}
		
		
	}
	
}

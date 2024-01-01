package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentsDao;
import Dto.Lectures;
import Dto.Students;

@WebServlet("/insertmarks")
public class insertmarks extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	private String usn;
//	private int maths;
//	private int science;
//	private int social;
//	private int hindi;
//	private int kannada;
//	private int physics;
//	
	String usn=req.getParameter("usn");
	String name=req.getParameter("name");

	int maths=Integer.parseInt(req.getParameter("maths"));
	int science=Integer.parseInt(req.getParameter("science"));
	int socila=Integer.parseInt(req.getParameter("social"));
	int hindi=Integer.parseInt(req.getParameter("hindi"));
	int kannada=Integer.parseInt(req.getParameter("kannada"));
	int physics=Integer.parseInt(req.getParameter("physics"));
	
int total=maths+science+socila+hindi+kannada+physics;
double percentage=total*100/600;

Lectures l= (Lectures) req.getSession().getAttribute("lec");

Students s=new Students();
s.setDept(l.getLoc());
s.setHindi(hindi);
s.setKannada(kannada);
s.setMaths(maths);
s.setUsn(usn);
s.setPercentage(percentage);
s.setPhysics(physics);
s.setScience(science);
s.setSocial(socila);
s.setTotal(total);
s.setName(name);
StudentsDao ss=new StudentsDao();

ss.insert(s);

resp.getWriter().print("<h1>data added<h2>");
req.getRequestDispatcher("again.jsp").include(req, resp);

	
}
}

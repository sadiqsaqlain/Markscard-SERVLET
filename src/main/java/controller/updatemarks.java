package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentsDao;
import Dto.Students;

@WebServlet("/updatemarks")
public class updatemarks extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
			
	Students ss=new Students();
	StudentsDao dd=new StudentsDao();
	Students s=dd.fetch(usn);
	s.setHindi(hindi);
	s.setKannada(kannada);
	s.setMaths(maths);
	s.setUsn(usn);
	s.setPercentage(percentage);
	s.setPhysics(physics);
	s.setScience(science);
	s.setSocial(socila);
	s.setTotal(total);
	dd.update(s);
	}
}

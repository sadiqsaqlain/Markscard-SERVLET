package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LecturesDao;
import Dto.Lectures;

@WebServlet("/createlecture")
public class createlecture extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");

		String mobb=req.getParameter("mob");
		long mob=Long.parseLong(mobb);
		String loc=req.getParameter("loc");
		
		LecturesDao ll=new LecturesDao();
		Lectures l=new Lectures();
		l.setPwd(pwd);
		l.setEmail(email);
		l.setMob(mob);
		l.setName(name);
		l.setLoc(loc);
	    
		Lectures lid= ll.insert(l);
		
		
		

	}
}

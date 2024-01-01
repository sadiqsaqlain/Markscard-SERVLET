package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LecturesDao;

@WebServlet("/fetchalllectures")
public class fetchalllectures extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LecturesDao l=new LecturesDao();
		req.setAttribute("lect", l.fetchall());
		req.getRequestDispatcher("Alllectures.jsp").include(req, resp);

	}
}

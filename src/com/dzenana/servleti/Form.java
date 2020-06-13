package com.dzenana.servleti;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Form")
public class Form extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String datumRodenja = request.getParameter("datumRodenja");
		String email = request.getParameter("email");
		String adresa = request.getParameter("adresa");
		
		request.setAttribute("ime", ime);
		request.setAttribute("prezime", prezime);
		request.setAttribute("datumRodenja", datumRodenja);
		request.setAttribute("email", email);
		request.setAttribute("adresa", adresa);
		
		request.getRequestDispatcher("/form.jsp").forward(request, response);
	}

}

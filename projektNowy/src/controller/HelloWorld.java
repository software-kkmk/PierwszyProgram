package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;


public class HelloWorld extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
	  response.setContentType("text/html; charset=UTF-8");
	  PrintWriter out = response.getWriter();
	  try { 
		  String login = request.getParameter("login");
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<title> Servlet </title>");
		  out.println("</head>");
		  out.println("<body>");
		  out.println("<h1>Witaj"+login+"na tym swiecie!</h1>");
	  } finally {
		  out.close();
	  }
	  }
	  
	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		 processRequest(request, response); 
	  }
	  
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		 processRequest(request, response); 
	  }
	  
	  @Override 
	  public String getServletInfo()
	  {
		  return "Short description";
	  }
  
  
}

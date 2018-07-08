package com.nucleus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.service.Service;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int ch = 0,value = 0;
		response.setContentType("text/html");
		String file=request.getParameter("file");
		String level=request.getParameter("level");
		//System.out.println(file +" "+level);
		if(level.equals("F"))
		{
			ch=2;
		}
		else if(level.equals("R"))
		{
			ch=1;
			
		}
		Service s=new Service();
		try 
		{
			value=s.service(file,ch);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(value==1)
		{
		    RequestDispatcher rd=request.getRequestDispatcher("success.html");
		    PrintWriter p=response.getWriter();
		    p.println("Data Successfully inserted");
		    rd.forward(request, response);
		}
		if(value==0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("failure.html");
		    PrintWriter p=response.getWriter();
		    p.println("There is error in data");
		    rd.forward(request, response);
		}
		
	}
		
		
	}



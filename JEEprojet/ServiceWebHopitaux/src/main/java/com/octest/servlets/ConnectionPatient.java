package com.octest.servlets;



import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.octest.bdd.IdentifiantsPatient;
import com.octest.beans.Patient;
import com.octest.connection.Connection;

public class ConnectionPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConnectionPatient() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    	
		this.getServletContext().getRequestDispatcher("/WEB-INF/patient.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Connection connect = new Connection();
        
        connect.verifierIdentifiantsPatient(request);
        request.setAttribute("connect",connect);
		this.getServletContext().getRequestDispatcher("/WEB-INF/patient.jsp").forward(request, response);
	}

}
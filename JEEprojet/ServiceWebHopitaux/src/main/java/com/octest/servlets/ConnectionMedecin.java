package com.octest.servlets;



import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.octest.bdd.IdentifiantsMedecin;
import com.octest.beans.Medecin;
import com.octest.connection.Connection;

public class ConnectionMedecin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConnectionMedecin() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/medecin.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		Connection connect = new Connection();		
        connect.verifierIdentifiantsMedecin(request);
        request.setAttribute("connect",connect);
		this.getServletContext().getRequestDispatcher("/WEB-INF/medecin.jsp").forward(request, response);
	}

}
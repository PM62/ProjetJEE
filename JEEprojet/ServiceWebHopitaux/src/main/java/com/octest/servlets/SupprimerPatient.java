package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.bdd.NouveauPatient;
import com.octest.beans.Patient;


public class SupprimerPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SupprimerPatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NouveauPatient tablePatients = new NouveauPatient();
        request.setAttribute("patients", tablePatients.recupererPatient());
		this.getServletContext().getRequestDispatcher("/WEB-INF/supprimerpatient.jsp").forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Patient Supprimerpatient = new Patient();
		Supprimerpatient.setIdPatient(request.getParameter("idpatient"));
        
        
        NouveauPatient tablePatients = new NouveauPatient();
        tablePatients.supprimerPatient(Supprimerpatient);
        
        request.setAttribute("patients", tablePatients.recupererPatient());
        
		this.getServletContext().getRequestDispatcher("/WEB-INF/supprimerpatient.jsp").forward(request, response);
		}

}

package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.bdd.NouveauPatient;
import com.octest.beans.Patient;


public class ModifierPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ModifierPatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NouveauPatient tablePatients = new NouveauPatient();
        request.setAttribute("patients", tablePatients.recupererPatient());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierpatient.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Patient Modifierpatient = new Patient();
		Modifierpatient.setIdPatient(request.getParameter("idpatient"));
		Modifierpatient.setMedical(request.getParameter("informations_médicales"));
        
        
        NouveauPatient tablePatients = new NouveauPatient();
        tablePatients.modifierPatient(Modifierpatient);
        
        request.setAttribute("patients", tablePatients.recupererPatient());
		this.getServletContext().getRequestDispatcher("/WEB-INF/modifierpatient.jsp").forward(request, response);
	}

}

package com.octest.servlets;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.beans.Patient;
import com.octest.bdd.NouveauPatient;


public class AjouterPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AjouterPatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NouveauPatient tablePatients = new NouveauPatient();
        request.setAttribute("patients", tablePatients.recupererPatient());
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouterpatient.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Patient Nouveaupatient = new Patient();
        Nouveaupatient.setNom(request.getParameter("nom"));
        Nouveaupatient.setPrenom(request.getParameter("prenom"));
        Nouveaupatient.setMdp(request.getParameter("mdp"));
        Nouveaupatient.setMedical(request.getParameter("information_medicales"));
        
        NouveauPatient tablePatients = new NouveauPatient();
        tablePatients.ajouterPatient(Nouveaupatient);
        
        request.setAttribute("patients", tablePatients.recupererPatient());

		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/ajouterpatient.jsp").forward(request, response);

	}

}

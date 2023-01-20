package com.octest.connection;


import com.octest.bdd.IdentifiantsMedecin;
import com.octest.bdd.IdentifiantsPatient;
import com.octest.beans.Medecin;
import com.octest.beans.Patient;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


public class Connection {
	
	
	private Boolean resultatM;
	private Boolean resultatP;
	
		

        
	public void verifierIdentifiantsMedecin(HttpServletRequest request) {			
	IdentifiantsMedecin identification = new IdentifiantsMedecin();
		
		
		Medecin medecin = new Medecin();
        medecin.setIdMedecin(request.getParameter("idmedecin"));
        medecin.setMdp(request.getParameter("mdp"));
        
			if( identification.MDPmedecin(medecin) == medecin.getMdp() ) {
				resultatM = true;
				
			
			}
			else {				
				resultatM = false;
			}			
		}
	
	public Boolean getResultatM() {
		return resultatM;
	}

	public void setResultatM(Boolean resultatM) {
		this.resultatM = resultatM;
	}
		
	
	public void verifierIdentifiantsPatient(HttpServletRequest request) {
		
		IdentifiantsPatient identification = new IdentifiantsPatient();
		Patient patient = new Patient();
        patient.setIdPatient(request.getParameter("idpatient"));
        patient.setMdp(request.getParameter("mdp"));
		
        
		if( identification.MDPpatient(patient) == patient.getMdp() ) {
			resultatP = true;
			HttpSession session = request.getSession();
						
			session.setAttribute("ipatient", patient.getIdPatient());
			
			


		}
		else {
			
			resultatP = false;
		}		
	}
	
	public Boolean getResultatP() {
		return resultatP;
	}

	public void setResultatP(Boolean resultatP) {
		this.resultatP = resultatP;
	}
}	



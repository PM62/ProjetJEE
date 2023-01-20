package com.octest.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.Patient;



public class NouveauPatient {
	 private Connection connexion;
	 
	 public List<Patient> recupererPatient() {
	        List<Patient> patients = new ArrayList<Patient>();
	        Statement statement = null;
	        ResultSet resultat = null;

	        loadDatabase();
	        
	        try {
	            statement = connexion.createStatement();
	           
	           
	            resultat = statement.executeQuery("SELECT idPatient, nom, prenom, mdp, medical  FROM patients;");

	            
	            while (resultat.next()) {
	            	String idPatient = resultat.getString("idPatient");
	                String nom = resultat.getString("nom");
	                String prenom = resultat.getString("prenom");
	                String mdp = resultat.getString("mdp");
	                String medical = resultat.getString("medical");
	                
	                Patient patient = new Patient();
	                patient.setIdPatient(idPatient);
	                patient.setNom(nom);
	                patient.setPrenom(prenom);
	                patient.setMdp(mdp);
	                patient.setMedical(medical);
	                
	                patients.add(patient);
	            }
	        } catch (SQLException e) {
	        } finally {
	           
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (statement != null)
	                    statement.close();
	                if (connexion != null)
	                    connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	        return patients;
	    }
	
	 private void loadDatabase() {
	       
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	        }

	        try {
	            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjee", "root", "0000");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void ajouterPatient(Patient patient) {
	        loadDatabase();
	        
	        try {
	            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO patients(nom, prenom, mdp, medical) VALUES(?, ?, ?, ?);");
	            preparedStatement.setString(1, patient.getNom());
	            preparedStatement.setString(2, patient.getPrenom());
	            preparedStatement.setString(3, patient.getMdp());
	            preparedStatement.setString(4, patient.getMedical());
	            
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	  }
	    
	    public void modifierPatient(Patient patient) {
	        loadDatabase();
	        
	        try {
	            PreparedStatement preparedStatement = connexion.prepareStatement("UPDATE patients SET medical = ? WHERE idPatient = ?;");
	            
	            preparedStatement.setString(1, patient.getMedical());            
	            preparedStatement.setString(2, patient.getIdPatient());
	            
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	  }
	    
	    public void supprimerPatient(Patient patient) {
	        loadDatabase();
	        
	        try {
	            PreparedStatement preparedStatement = connexion.prepareStatement("DELETE FROM patients WHERE idPatient = ?;");	            
	            preparedStatement.setString(1, patient.getIdPatient());
	            
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	  }
	    
//	    public void InfoPatient() {
//	        loadDatabase();
//	        
//	        try {
//	            PreparedStatement preparedStatement = connexion.prepareStatement("SELECT medical FROM patients WHERE idPatient = ?;");	            
//	            
//	            preparedStatement.setString(1, sessionScope.idpatient);
//	            
//	            preparedStatement.executeUpdate();
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	  }
}



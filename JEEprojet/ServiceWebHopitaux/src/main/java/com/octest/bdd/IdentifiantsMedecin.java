package com.octest.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.Medecin;


public class IdentifiantsMedecin {
	 private Connection connexion;
    
	   	    
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
	    
	    
		
		public 	String MDPmedecin(Medecin medecin) {
	        loadDatabase();
	        
	        Statement statement = null;
	        ResultSet resultat = null;
	        String mdp = null;
	        try {
	        	String  sql = "SELECT mdp FROM medecins WHERE idMedecin = " + medecin.getIdMedecin();
	        	statement = connexion.createStatement();
		           	           
	            resultat = statement.executeQuery(sql);	            

	            
	            mdp = resultat.getString("mdp");
	            
	            
	            
	        } 
	       
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
			
			
	       
			return mdp;
	  }

	    
	

}
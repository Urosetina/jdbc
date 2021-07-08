package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metode.CommonMethods;
import model.Drzava;
import dao.FakultetLogic;

public class UpdateServis {

	CommonMethods common = new CommonMethods();
	FakultetLogic logic = new FakultetLogic();
    public Drzava setujDrzavu(String idDrzava, String nazivDrzave) {
			
		return common.setujDrzavu(idDrzava, nazivDrzave);	}
	
	
	
	
	public void updateNazivDrzave(Drzava drzava) {
		
		logic.updateNazivDrzave(drzava);
		
		
	


	
	
	
	
	
	
	
	}
	
}

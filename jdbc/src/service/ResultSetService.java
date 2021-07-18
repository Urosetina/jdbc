package service;

import dao.ResultSetLogic;
import model.Predmet;

public class ResultSetService {

	
	ResultSetLogic rsLogic = new ResultSetLogic();

	public String dajMiNazivSmera(String id) {
		
		
		
		
		
		return rsLogic.vratiNazivSmeraPoId(id);
	}

	public Predmet vratiMiPredmet(String id) {
		
		
		
		return rsLogic.vratiPredmetPoId(id);
	}
	
	
	
	
	
	
	
	
	
	
}

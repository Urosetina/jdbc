package controller;

import model.Predmet;
import service.ResultSetService;

public class ResultSetController {

	
	ResultSetService rsService = new ResultSetService();

	public String dajMiNazivSmera(String id) {
		
		
		
		
		
		
		return rsService.dajMiNazivSmera(id);
	}

	public Predmet vratiMiPredmet(String id) {
		
		return rsService.vratiMiPredmet(id);
	}
	
	
	
	
	
	
	
}


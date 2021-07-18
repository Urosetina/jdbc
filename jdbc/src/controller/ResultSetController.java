package controller;

import java.util.List;

import model.Predmet;
import model.Student;
import service.ResultSetService;

public class ResultSetController {

	
	ResultSetService rsService = new ResultSetService();

	public String dajMiNazivSmera(String id) {
		
		
		
		
		
		
		return rsService.dajMiNazivSmera(id);
	}

	public Predmet vratiMiPredmet(String id) {
		
		return rsService.vratiMiPredmet(id);
	}

	public List<Student> dajMiSveStudenteIzBaze() {
		
		return rsService.dajMiSveStudenteIzBaze();
	}
	
	
	
	
	
	
	
}


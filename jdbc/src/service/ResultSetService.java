package service;

import java.util.List;

import dao.ResultSetLogic;
import model.Predmet;
import model.Student;

public class ResultSetService {

	
	ResultSetLogic rsLogic = new ResultSetLogic();

	public String dajMiNazivSmera(String id) {
		
		
		
		
		
		return rsLogic.vratiNazivSmeraPoId(id);
	}

	public Predmet vratiMiPredmet(String id) {
		
		
		
		return rsLogic.vratiPredmetPoId(id);
	}

	public List<Student> dajMiSveStudenteIzBaze() {
		
		
		
		return rsLogic.vratiSveStudente();
	}
	
	
	
	
	
	
	
	
	
	
}

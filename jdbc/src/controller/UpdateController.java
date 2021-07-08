package controller;

import model.Drzava;
import service.UpdateServis;

public class UpdateController {

	
	UpdateServis service = new UpdateServis();
	
	
	public void proslediParametre(String idDrzava, String nazivDrzave) {
		
		Drzava drzava = service.setujDrzavu(idDrzava, nazivDrzave);
			service.updateNazivDrzave(drzava);
		
		
		
		
	}

}

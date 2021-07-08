package service;

import dao.FakultetLogic;
import metode.CommonMethods;

public class SelectServis {

	
	CommonMethods common = new CommonMethods();
	FakultetLogic logic = new FakultetLogic();
	
	
	public int vratiIdStudenta(String index) {
		
		return logic.vratiIdStudenta(index);
	}
	
	
	
	
	
	
	
	
	
}

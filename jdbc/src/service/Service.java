package service;

import dao.FakultetLogic;
import metode.CommonMethods;
import model.Student;

public class Service {

	
	FakultetLogic logic = new FakultetLogic();
	CommonMethods metode = new CommonMethods();
	
	
	public void unesiStudenta(Student student) {
		logic.unesiStudenta(student);
						
	}
	
	public void unesiDrzavu(String imeDrzave) {
		logic.unesiDrzavu(imeDrzave);
		
	}

	public void posaljiPozdrav() {
		
		metode.Pozdrav();
		
	}

	public Student setStudent(String ime, String prezime, int index, int smer, int drzava, int ispiti) {
		
		
		
		return CommonMethods.setStudent(ime, prezime, index, drzava, smer, ispiti);
	}

	

	
	
	
	
	
	
	
	
	
}

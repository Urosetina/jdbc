package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.FakultetLogic;
import metode.CommonMethods;
import model.Student;
import service.Service;

public class MainKlasa {

	public static void main(String[] args) {
		
		Service service = new Service();
			
		
		String ime = "Laki";
		String prezime = "Lakic";
		int index = 590;
		int smer = 4;
		int drzava = 6;
		int ispiti = 3;
		
			String imeDrzave = "Numbani";
			
			
				Student student = service.setStudent(ime, prezime, index, smer, drzava, ispiti);
				service.posaljiPozdrav();
				service.unesiStudenta(student);
				service.unesiDrzavu(imeDrzave);
				
				
				
				
		
		
		
		

	}

}

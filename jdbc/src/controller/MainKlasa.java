package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.FakultetLogic;
import metode.CommonMethods;
import model.Student;
import service.Service;
import java.util.Scanner;

public class MainKlasa {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
		
		UpdateController controller = new UpdateController();
			
			
		
			System.out.println("Unesite id drzave: ");
		String idDrzava = scanner.nextLine();
		
			System.out.println("Unesite naziv drzave: ");
		String nazivDrzave = scanner.nextLine();
		
				
			controller.proslediParametre(idDrzava, nazivDrzave);	
				
			
				scanner.close();
				
				
		
		
		
		

	}

}

package view;

import controller.ResultSetController;
import model.Predmet;

import java.util.Scanner;

public class ResultSetViewGlavnaKlasa {

	public static void main(String[] args) {
		
		
		ResultSetController controller  = new ResultSetController();
		
			Scanner scanner = new Scanner(System.in);
				System.out.println("Unesite id smera: ");
				String id = scanner.nextLine();
					scanner.close();
		/*
		String nazivSmera = controller.dajMiNazivSmera(id);
		
		System.out.println("Naziv smera je: " + nazivSmera);
		*/
					
		Predmet predmet = controller.vratiMiPredmet(id);
		
		// ispis predmeta iz baze
			System.out.println("Izabrani predmet: ");
			System.out.println("ID: " + predmet.getIdPredmet());
			System.out.println("Naziv predmeta: " + predmet.getNazivPredmeta());
			System.out.println("Broj semestara: " + predmet.getBrojSemestara());
			System.out.println("Broj smera: " + predmet.getSmer());
			
		
		/*KRECEMO OD USER INTERFACE-A, TJ GLAVNE KLASE
	      POZIVAMO KONTROLER DA NAM VRATI OBJEKAT PREDMET 
	      (koji smo prethodno napravili kao model po uzoru na tabelu predmet u bazi)
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

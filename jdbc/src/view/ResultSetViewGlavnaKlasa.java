package view;

import controller.ResultSetController;
import model.Predmet;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResultSetViewGlavnaKlasa {

	public static void main(String[] args) {
		
		
		ResultSetController controller  = new ResultSetController();
		
			Scanner scanner = new Scanner(System.in);
				System.out.println("Unesite id smera: ");
				String id = scanner.nextLine();
					scanner.close();
		
		
		List<Student> sviStudenti = new ArrayList<>();
		
		
			sviStudenti = controller.dajMiSveStudenteIzBaze();
				System.out.println("id**ime**prezime**index**smer**drzava**polozeni ispiti**");
			for(Student s: sviStudenti) {
			
				System.out.println(
				s.getIdStudent() + " " +
				s.getIme() + " " +
				s.getPrezime() + " " +
				s.getBrojIndexa() + 
				" " + s.getSmer() + 
				" " + s.getDrzava() + 
				" " +  s.getIspiti());
			
			}
			

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

package metode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Drzava;
import model.Student;

public class CommonMethods {

	
	
	public static Connection connect (String imeBaze) throws SQLException {
		
			 final String user = "root";
			 final String password = "root";
			 final String url = "jdbc:mysql://localhost:3306/" + imeBaze;
			 
			 try {
					Class.forName("com.mysql.cj.jdbc.driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		
	
			return DriverManager.getConnection(user, password, url);
							
		
		
	}
	
	public void Pozdrav() {
		
		System.out.println("Pozdrav iz moje aplikacije :)!");
		
	}
	
	
	public static Student setStudent(String ime, String prezime, int index, int drzava, int smer, int ispiti) {
		
		Student student = new Student();	
		student.setIme(ime);
		student.setPrezime(prezime);
		student.setBrojIndexa(index);
		student.setSmer(smer);
		student.setDrzava(drzava);
		student.setIspiti(ispiti);
		
			return student;
	}

	public Drzava setujDrzavu(String idDrzava, String nazivDrzave) {

		Drzava drzava = new Drzava();
		drzava.setIdDrzave(Integer.parseInt(idDrzava));
		drzava.setNazivDrzave(nazivDrzave);
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}

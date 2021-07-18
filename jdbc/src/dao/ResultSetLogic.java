package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metode.CommonMethods;
import model.Predmet;
import model.Student;

public class ResultSetLogic {

	
	
	public String vratiNazivSmeraPoId(String id) {
		
		String smer = "";
		
		
		FakultetLogic logic = new FakultetLogic();
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

			
		try {
			con = CommonMethods.connect("fakultet2");
				System.out.println("Connection OK!");
				String query = "SELECT naziv FROM smer WHERE id = ?";
				ps = con.prepareStatement(query);
					ps.setInt(1, Integer.parseInt(id));
						rs = ps.executeQuery();
						
						while(rs.next()) {
							
							smer = rs.getString("naziv");
							
						}
				
				
				
				
				
				
			
		} catch (SQLException e) {
				System.out.println("Connection FAILED");
			e.printStackTrace();
		} finally {
			
			logic.closeResultSet(rs);
			logic.closePreparedStatement(ps);
			logic.closeConnection(con);
			
		}
			
		
		
		return smer;
		
		
	}
	
	
	public Predmet vratiPredmetPoId(String id) {
		
		Predmet predmet = new Predmet();
		FakultetLogic logic = new FakultetLogic();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = CommonMethods.connect("Fakultet2");
				System.out.println("Connection OK!");
				
				String query = "Select * FROM predmet WHERE id = ?";
					ps = con.prepareStatement(query);
					ps.setInt(1, Integer.parseInt(id));
					
					rs = ps.executeQuery();
					
					while (rs.next()) {
						
						// mapiranje modela i resultSeta: 
						
						predmet.setIdPredmet(rs.getInt("id"));
						predmet.setNazivPredmeta(rs.getString("naziv_predmeta"));
						predmet.setBrojSemestara(rs.getInt("broj_semestara"));
						predmet.setSmer(rs.getInt("smer"));
					}
				
				
				
				
				
				
		} catch (SQLException e) {
				System.out.println("Connection FAILED!");
			e.printStackTrace();
			
		} finally {
			
			logic.closeResultSet(rs);
			logic.closePreparedStatement(ps);
			logic.closeConnection(con);
			
		}
	
		
		return predmet;
		
	}


	public List<Student> vratiSveStudente() {
		
		List<Student> studentiIzBaze = new ArrayList<>();
		FakultetLogic logic = new FakultetLogic();
		
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
		
			try {
				con = CommonMethods.connect("fakultet2");
					System.out.println("Connection OK!");
					String query = "Select * FROM student";	
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				
				while (rs.next()) {
					Student s = new Student();
						s.setIdStudent(rs.getInt("id_student"));
						s.setIme(rs.getString("ime"));
						s.setPrezime(rs.getString("prezime"));
						s.setBrojIndexa(rs.getInt("broj_indexa"));
						s.setSmer(rs.getInt("smer"));
						s.setDrzava(rs.getInt("drzava"));
						s.setIspiti(rs.getInt("polozeni_ispiti"));
						
						
				studentiIzBaze.add(s);
				}			
				
			} catch(SQLException e) {
					System.out.println("Connection FAILED!");
				e.printStackTrace();
			} finally {
				logic.closeResultSet(rs);
				logic.closePreparedStatement(ps);
				logic.closeConnection(con);
			
			}
		
		
		return studentiIzBaze;
	}
	
	
	
	/* prvo smo napravili model Studenta, u resultView(glavna) smo stavili metode koja vraca sve 
	  studente, prosledili je controlleru, controller je prosledio svom pomocniku servisu,
	  i dosli smo do logike, gde pravimo ono sto nam treba
	*/
	
	
	
	
}

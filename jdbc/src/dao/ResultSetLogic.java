package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metode.CommonMethods;
import model.Predmet;

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
	
	
	
	
	
	
	
	
	
	
}

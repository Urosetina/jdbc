package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metode.CommonMethods;
import model.Drzava;
import model.Student;

public class FakultetLogic {
	
	


	private void closePreparedStatement (PreparedStatement ps) {
		
		if(ps != null) {
			
			try {
				ps.close();
					System.out.println("PreparedStatement CLOSED!");
					
			} catch (SQLException e) {
					System.out.println("PreparedStatement unsuccesfully CLOSED!");
				e.printStackTrace();
			}
		}
		
		
	}
	
	private void closeConnection (Connection con) {
		
		if(con != null) {
			
			try {
				con.close();
					System.out.println("Connection CLOSED!");
				
			} catch (SQLException e) {
					System.out.println("Connection unsuccesfully closed!");
				e.printStackTrace();
			}
		
		}
		
	}
	
	public void unesiDrzavu(String imeDrzave) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			 con = CommonMethods.connect("fakultet2");
				System.out.println("Connection OK!");
				
				String query = "INSERT INTO drzava VALUES (null, ?)";
				 ps = con.prepareStatement(query);
					ps.setString(1, imeDrzave);
						ps.execute();
						
					 	System.out.println("Upisan/a " + imeDrzave + " u tabelu drzava!");
			
			
		} catch (SQLException e) {
				System.out.println("Connection FAILED!");
			e.printStackTrace();
			
		} finally {
			
			closeConnection(con);
			closePreparedStatement(ps);
		}
			
		
	}	
		
		public void unesiStudenta(Student student) {
			
			Connection con = null;
			PreparedStatement ps = null;
			try {
				con = CommonMethods.connect("fakultet2");
					System.out.println("Connection OK!");
					
					String query = "INSERT INTO student VALUES (null, ?, ?, ?, ?, ?, ?)";
					ps = con.prepareStatement(query);
						ps.setString(1, student.getIme());
						ps.setString(2, student.getPrezime());
						ps.setInt(3, student.getBrojIndexa());
						ps.setInt(4, student.getSmer());
						ps.setInt(5, student.getDrzava());
						ps.setInt(6, student.getIspiti());
				    		ps.execute();
				    		
								System.out.println("Upisan student u tabelu Student!");				
				
			} catch (SQLException e) {
				
					System.out.println("Connection FAILED!");
				
				e.printStackTrace();
				
			} finally {
				
				closePreparedStatement(ps);
				closeConnection(con);
				
			}
				
			
		}
		
		public void unesiSmer (String nazivSmera, String opis) {
			
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				con = CommonMethods.connect("fakultet2");
					System.out.println("Connection OK!");
					
					String query = "INSERT INTO smer VALUES (null, ?, ?)";
					ps = con.prepareStatement(query);
						ps.setString(1, nazivSmera);
						ps.setString(2, opis);
							ps.execute();
							
								System.out.println("Upisan smer u tabelu Smer!");
				
				
			} catch (SQLException e) {
					System.out.println("Connection FAILED!");
				e.printStackTrace();
				
			} finally {
				
				closePreparedStatement(ps);
				closeConnection(con);
				
			}
			
	
		}
		
		public void unesiPredmet (String nazivPredmeta, int brojSemestara) {
			
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				con = CommonMethods.connect("fakultet2");
					System.out.println("Connection OK!");
					
					String query = "INSERT INTO predmet VALUES (null, ?, ?)";
					ps = con.prepareStatement(query);
						ps.setString(1, nazivPredmeta);
						ps.setInt(2, brojSemestara);
							ps.execute();
								System.out.println("Upisan predmet u tabelu Predmet!");
					
				
				
			} catch (SQLException e) {
					System.out.println("Connection FAILED");
				e.printStackTrace();
				
			} finally {
				
				closePreparedStatement(ps);
				closeConnection(con);
				
			}
			
			
		}
		
		public void unesiPoverljivPodatak(int jmbg, int password, int brojRacuna) {
			
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				con = CommonMethods.connect("fakultet2");
					System.out.println("Connection OK!");
					
					String query = "INSERT INTO poverljivo VALUES (null, ?, ?, ?)";
					ps = con.prepareStatement(query);
						ps.setInt(1, jmbg);
						ps.setInt(2, password);
						ps.setInt(3, brojRacuna);
							ps.execute();
					
					
				
			} catch (SQLException e) {
					System.out.println("Connection FAILED!");
				e.printStackTrace();
				
			} finally {
				
				closePreparedStatement(ps);
				closeConnection(con);
				
			}
			
			
		}

		public void updateNazivDrzave(Drzava drzava) {
			Connection con = null;
			PreparedStatement ps = null;
			
				try {
					con = CommonMethods.connect("fakultet2");
						System.out.println("Connection OK!");
					String query = "UPDATE drzava SET naziv = ? WHERE id = ?;";
					ps = con.prepareStatement(query);
						ps.setString(1, drzava.getNazivDrzave());
						ps.setInt(2, drzava.getIdDrzave());
							ps.executeUpdate();
							
							System.out.println("Ime drzave promenjeno na " + drzava.getNazivDrzave());
					
							
					
					
				} catch (SQLException e) {
						System.out.println("Connection FAILED");
					e.printStackTrace();
					
				} 
				
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


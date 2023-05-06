package jdbchospitalapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalDao {

	public void saveHospital(HospitalDto hospital) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			PreparedStatement ps = conn.prepareStatement("Insert Into test1.hospital values(?,?,?,?,?)");
			ps.setInt(1, hospital.getId());
			ps.setString(2, hospital.getHname());
			ps.setInt(3, hospital.getNoofdr());
			ps.setInt(4, hospital.getNoofbeds());
			ps.setString(5, hospital.getAddress());
			
			ps.executeUpdate();
			System.out.println("Data is Inserted Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void getHospitalById() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		try {
			Class.forName( "com.mysql.cj.jdbc.Driver");
			//String dburl = "jdbc:mysql://localhost:3306/test1?=root&password=root"; 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			String query = "Select * from test1.hospital where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("Enter Hospital id");
			int id= sc.nextInt();
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			System.out.println("ID\t"+"HNAME\t"+"NOOFDR\t"+"NOOFBEDS\t"+"ADDRESS\t");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getInt(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.println();
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void getAllHospital()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//String dburl = "jdbc:mysql://localhost:3306","root","root";
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			String query = "select * from test1.hospital";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs= ps.executeQuery();
			
			System.out.println("ID\t"+"HNAME\t"+"NOOFDR\t"+"NOOFBEDS\t"+"ADDRESS");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getInt(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getString(5)+"");
				System.out.println();
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void updateHospitalById() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		try {
			Class.forName( "com.mysql.cj.jdbc.Driver");
			//String dburl = "jdbc:mysql://localhost:3306/test1?=root&password=root"; 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			String query = "update test1.hospital set hname=? where id=? ";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("Enter Hospital id");
			int id= sc.nextInt();
			System.out.println("Enter new name");
			String hname = sc.next();
			ps.setString(1, hname);
			ps.setInt(2, id);
			
            boolean result = ps.execute();
			
			if(result==true)
			{
				System.out.println("Data is not updated");
				
			}
			else {
				System.out.println("Data is updated");
			}
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void deleteHospital() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?user=root&password=root");
			
			PreparedStatement ps= conn.prepareStatement("delete from hospital where id=?");
			
			System.out.println("Enter hospital id which you want to delete..");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			
			boolean result = ps.execute();
			
			if(result==true)
			{
				System.out.println("data is not deleted");
				
			}
			else {
				System.out.println("data is deleted");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
	}
	
	  
	 
}

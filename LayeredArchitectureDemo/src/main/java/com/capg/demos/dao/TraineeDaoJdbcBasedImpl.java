package com.capg.demos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capg.demos.model.Trainee;

public class TraineeDaoJdbcBasedImpl implements TraineeDao {

	Connection con;
	PreparedStatement ps;
	
	public TraineeDaoJdbcBasedImpl() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
														"scott","tiger");
		
	}
	
	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		ps=con.prepareStatement("insert into trainee values(?,?,?)");
		ps.setInt(1, trainee.getId());
		ps.setString(2, trainee.getName());
		ps.setString(3, trainee.getEmail());
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated>0) {
			return trainee;
		}
		else
			return null;

	}

	@Override
	public Trainee findTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		Trainee t = null;
		ps = con.prepareStatement("select * from emp where id=?");  
		ResultSet rs=ps.executeQuery();  
		while(rs.next()){  
			t = new Trainee(rs.getInt(1),rs.getString(2),rs.getString(3)); 
		}  
		return t;
	}

	@Override
	public void removeTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		ps=con.prepareStatement("delete from trainee where id=?");  
		ps.setInt(1,id);    
		int i=ps.executeUpdate();
		System.out.println(i+" record deleted!!");
	}

}

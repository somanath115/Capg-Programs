package com.capg.demos.service;

import java.sql.SQLException;

import com.capg.demos.dao.TraineeDao;
import com.capg.demos.dao.TraineeDaoCollectionsBasedImpl;
import com.capg.demos.dao.TraineeDaoJdbcBasedImpl;
import com.capg.demos.model.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeDao dao;
	public TraineeServiceImpl() throws SQLException {
		dao=new TraineeDaoJdbcBasedImpl();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return dao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		dao.removeTrainee(id);
	}

	@Override
	public Trainee getTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findTrainee(id);
	}

}

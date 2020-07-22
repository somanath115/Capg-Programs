package com.capg.demos;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import com.capg.demos.controller.TraineeController;
import com.capg.demos.model.Trainee;

/**
 * Hello world!
 *
 */




public class App 
{
	
    public static void main( String[] args ) throws SQLException
    {
    	TraineeController controller=new TraineeController();
    	Trainee t1;
    	int id;
    	String name;
    	String email;
    	Scanner in=new Scanner(System.in);
    	 System.out.println( "Enter Trainee Details - (Id,Name,email)" );
    	System.out.println("Enter ID:");
    	id=in.nextInt();
    	System.out.println("Enter Name:");
    	name=in.next()+in.nextLine();
    	System.out.println("Enter Email:");
    	email=in.next()+in.nextLine();
    	
    	Trainee trainee=new Trainee(id,name,email);
    	try {
    	Trainee addedTrainee=controller.addTrainee(trainee);
    	System.out.println("Trainee Added "+addedTrainee);
    	}
    	catch (Exception e) {
    		
			System.out.println("Error...");
			e.printStackTrace();
		}
    	System.out.println("Enter the id to be deleted");
    	int i = in.nextInt();
    	try {
    		controller.deleteTrainee(i);
    		System.out.println("Trainee with "+i+" deleted successfully");
    	}
    	catch(Exception e) {
    		System.err.println("Error in deletion..Invalid id!!");
    	}
    	System.out.println("Enter the id to be found");
    	int j = in.nextInt();
    	try {
    		Trainee traineeFounded = controller.findTrainee(j);
    		System.out.println("Trainee with id:"+j+"found");
    		System.out.println(traineeFounded);
    	}
    	catch(Exception e) {
    		System.err.println("Error in deletion..Invalid id!!");
    	}
    }
}

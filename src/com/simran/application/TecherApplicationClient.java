package com.simran.application;

import java.util.*;

import com.simran.model.Teacher;
import com.simran.service.TeacherService;

public class TecherApplicationClient {

	public static void main(String[] args) {
		System.out.println("Welcome User");
		Scanner s = new Scanner(System.in);
		System.out.println("Please Select: ");
		System.out.println("Insert Teacher: 1");
		System.out.println("Update Teacher: 2");
		System.out.println("Search Teacher: 3");
		System.out.println("Delete Techer: 4");
		int input = s.nextInt();
		switch(input) {
		case 1 :
			System.out.println("Enter Teacher Id: ");
			int id  = s.nextInt();
			System.out.println("Enter Teacher Name: ");
			String name = s.next();
			System.out.println("Enter Teacher Subject: ");
			String subject = s.next();
			TeacherService service = new TeacherService();
			service.insert(id, name, subject);
			break;
		case 2: 
			System.out.println("Update Operation Under Processing ");
			break;
		case 3: 
			System.out.println("Search Operation Under Processing ");
			break;
		case 4: 
			System.out.println("Delete Operation Under Processing ");
			break;
			
		}
		System.out.println("Operation Completed");

	}

}

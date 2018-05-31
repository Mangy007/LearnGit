package com.company.demo.driver;

import com.company.demo.process.College;
import com.company.demo.process.Department;
import com.company.demo.process.University;

public class DriverProcess
{

	public static void main(String[] args)
	{
		University university = new University();
		university.initializeUniversityName("Delhi University");
		
		College college1, college2;
		Department department1, department2;
		
		college1 = new College();
		college1.initializeCollegeName("HansRaj");
		department1 =new Department();
		department1.initializeDepartmentName("Science");
		department2 =new Department();
		department2.initializeDepartmentName("Arts");
		college1.addDepartment(department1);
		college1.addDepartment(department2);
		
		college2 = new College();
		college2.initializeCollegeName("LSRCC");
		department1 =new Department();
		department1.initializeDepartmentName("Electrical");
		department2 =new Department();
		department2.initializeDepartmentName("Computer Science");
		college2.addDepartment(department1);
		college2.addDepartment(department2);
		
		university.addCollege(college1);
		university.addCollege(college2);
		university.toString();
		
		
	}

}

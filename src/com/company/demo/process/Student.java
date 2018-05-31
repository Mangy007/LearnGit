package com.company.demo.process;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class Student 
{
	private String studentName;
	private String cgpa;
	private Integer studentRollNo;
	private JSONObject studentInfo;
	private List<Tuple<Integer, JSONObject>> studentMapping;	// can also be done with Map
	
	public Student()
	{
		studentName = null;
		cgpa = null;
		studentRollNo = 0;
		studentInfo = new JSONObject();
		studentMapping = new ArrayList<>();
	}

	public void addStudent(String sName, int sRollNo, String sCGPA)
	{
		studentName = sName;
		studentRollNo = sRollNo;
		cgpa = sCGPA;
		studentInfo.put("studentName", studentName);
		studentInfo.put("cgpa", cgpa);
		
		Tuple<Integer, JSONObject> tuple = new Tuple<Integer, JSONObject>(sRollNo, studentInfo);
		studentMapping.add(tuple);
	}

	@Override
	public String toString()
	{
		String result = "";
		
		result += studentInfo;
		
		return result;
	}
	
	
}

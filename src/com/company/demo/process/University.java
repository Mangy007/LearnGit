package com.company.demo.process;

import java.util.ArrayList;
import java.util.List;

public class University 
{
	private String universityName;
	private List<College> colleges;
	
	public University()
	{
		universityName = null;
		colleges = new ArrayList<>();
	}

	public void initializeUniversityName(String uName)
	{
		universityName = uName;
	}
	
	public void addCollege(College college)
	{
		colleges.add(college);
	}
	
	public University deepCopy()
	{
		University tempUniversity = new University();
		
		for (College college : colleges)
		{
			College collegeCopy = college.deepCopy();
			tempUniversity.addCollege(collegeCopy);
		}
		return tempUniversity;
	}

	@Override
	public String toString()
	{
		String result = "";
		
		colleges.forEach(n -> System.out.println(n.toString()));
		
		return result;
	}
	
	
	
}

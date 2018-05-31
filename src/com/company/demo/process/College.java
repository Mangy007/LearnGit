package com.company.demo.process;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class College 
{
	private String collegeName;
	private Set<Department> departments;
	
	public College()
	{
		collegeName = null;
		departments = new HashSet<>();
	}

	public void initializeCollegeName(String cName)
	{
		collegeName = cName;
	}
	
	public void addDepartment(Department departmentCopy)
	{
		departments.add(departmentCopy);
	}
	
	public College deepCopy()
	{
		College tempCollege = new College();
		
		for (Department department : departments)
		{
			Department departmentCopy = department.lazyCopy();
			tempCollege.addDepartment(departmentCopy);
		}
		return tempCollege;
	}

	@Override
	public String toString()
	{
		String result = "";
		
		result += "College: "+ collegeName;
		
		for (Department department : departments)
		{
			result += department.toString();
		}
		return result;
	}

}

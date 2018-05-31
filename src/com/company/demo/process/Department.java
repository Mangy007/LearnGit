package com.company.demo.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department
{
	private String departmentName;
	private Map<Integer, List<Student>> studentsData;
	
	public Department()
	{
		departmentName = null;
		studentsData = new HashMap<>();
	}

	public void initializeDepartmentName(String dName)
	{
		departmentName = dName;
	}
	
	public Department lazyCopy()
	{
		Department tempDepartment = new Department();
		
		List<Integer> keys = new ArrayList<>(studentsData.keySet());
		
		keys.forEach( i -> tempDepartment.addStudents(studentsData.get(i), keys.get(i)) );
		
		return tempDepartment;
	}

	public void addStudents(List<Student> listOfStudents, Integer key)
	{
		studentsData.put(key, listOfStudents);
	}

	@Override
	public String toString()
	{
		String result = "";
		
		List<Integer> keys = new ArrayList<>(studentsData.keySet());
		
		for (Integer key : keys)
		{
			result += studentsData.get(key).get(0).toString();
		}
		
		return result;
	}

	
}

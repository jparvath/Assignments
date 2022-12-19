package com.springboot.rest.webservices.restfulwebservices.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmployeeData {

	  private static List<EmployeeDetails> employee=new ArrayList<>();
	    private static int employeecount=0;
	    static
	    {
	        employee.add(new EmployeeDetails(++employeecount,"Parvathi","MCA","Computer",26000));
	        employee.add(new EmployeeDetails(++employeecount,"Prem","Phd","Maths",35000));
	        employee.add(new EmployeeDetails(++employeecount,"Suresh","Msc","Science",20000));
	    }
	    public List<EmployeeDetails> findAll()
	    {
	        return employee;
	    }
	    public EmployeeDetails findOneEmp(int id)
	    {
	        Predicate<? super EmployeeDetails> predicate=employees->employees.getEmployeeId().equals(id);
	        return employee.stream().filter(predicate).findFirst().orElse(null);
	    }
	    public EmployeeDetails save(EmployeeDetails user)
	    {
	        user.setEmployeeId(++employeecount);
	        employee.add(user);
	        return user;
	    }
	    public void deleteOneEmp(int id)
	    {
	        Predicate<? super EmployeeDetails> predicate=emps->emps.getEmployeeId().equals(id);
	        //return emp.stream().filter(predicate).findFirst().orElse(null);
	        employee.removeIf(predicate);
	    }

}

package com.sample1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sample1.entity.Employee;

public class EmployeeService {
	public List<Employee> getEmployeelist(){
		List<Employee> employeeList =new ArrayList<>();
		Employee emp1=new Employee(1,"dhinesh", "Ram", "ECE", 25000.00, "CHROMPET", "7598119526");
		Employee emp2=new Employee(2, "vicky", "s", "ECE", 20000.00, "guindy", "9887654230");
		Employee emp3=new Employee(3, "alon", "zo", "ECE", 60000.00, "TRIPLICANE","9876542345" );
		Employee emp4=new Employee(4, "DANY", "V", "ECE", 40000.00, "BESANT NAGAR","9896542345" );
		Employee emp5=new Employee(5, "ricky", "d", "ECE", 30000.00, "ADYAR","9876542045" );
		Employee emp6=new Employee(6, "Madan", "R", "ECE", 80000.00, "ADYAR","9876542040" );
		Employee emp7=new Employee(7, "william", "f", "ECE", 90000.00, "ADYAR","9876542045" );
		Employee emp8=new Employee(8, "sethu", "e", "ECE", 60000.00, "RA PURAM","9076542045" );
		Employee emp9=new Employee(9, "Vijay", "o", "EEE", 30000.00, "ADYAR","9876502045" );
		Employee emp10=new Employee(10, "Yash", "p", "EIE", 90000.00, "ADYAR","9806542045" );
		employeeList.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10));
		return employeeList;
		
	}
}
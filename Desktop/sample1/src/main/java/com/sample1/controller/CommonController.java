package com.sample1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample1.model.EmployeeService;

@WebServlet("/employeedetails")
public class CommonController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		EmployeeService employeeserrvice= new EmployeeService();
		PrintWriter out=response.getWriter();
		request.setAttribute("employeeDetails", employeeserrvice.getEmployeelist());
		employeeserrvice.getEmployeelist().stream().forEach(employee -> {
			out.println(employee.toString());
		});
		
	}

}

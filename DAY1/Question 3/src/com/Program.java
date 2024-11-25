package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static Employee searchByEmpId(List<Employee> list, int id) {
		
		for (Employee employee : list) {
			if (employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}
	
	
	public static Employee searchByEmpName(List<Employee>list,String name) {
		
		for (Employee employee : list) {
			if (employee.getName().equals(name)) {
				return employee;
			}
		}
		return null;
	}
	public static void main (String [] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Sam"));
		list.add(new Employee(2, "Raj"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee Search By");
		 System.out.println("1. Employee ID");
           System.out.println("2. Name");
	         int choice = sc.nextInt();
	         sc.nextLine();
	        
	         switch (choice) {
			case 1:
				  System.out.print("Enter Employee ID: ");
				  int id = sc.nextInt();
				  Employee empById = searchByEmpId(list,id);
                if (empById != null) {
                    System.out.println("Employee found: " + empById);
                } else {
                    System.out.println("Employee with ID " + id + " not found.");
                }
               break;
			case 2:
				System.out.println("Enter Employee Name");
				String name =sc.nextLine();
				Employee empByname  = searchByEmpName(list, name);
				if (empByname != null) {
					System.out.println("Employee found: " +empByname );
                } else {
                    System.out.println("Employee with ID " + name + " not found.");
                }
			default:
				break;
			}
	         
	}

}

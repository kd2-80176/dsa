package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {
	
	public static int menu () {
		int choice ;
		Scanner s= new Scanner(System.in);
		System.out.println("***************************************************");
		System.out.println("0--> EXIT");
		System.out.println("1-->ADD EMPLOYEE");
		System.out.println("2-->DISPLAY ALL EMPLOYEES");
		System.out.println("3-->SEARCH EMPLOYEE BY NAME ");
		System.out.println("4-->DELETE EMPLOYEE BY EMPID");
		System.out.println("5-->UPDATE SALARY OF GIVEN EMPID");
		System.out.println("***************************************************");

		System.out.println("Enter your choice ");
		choice=s.nextInt();
		
		return choice;
	}

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1= new LinkedList();
		
		int ch;
		Employee e1;
		while ((ch=menu())!=0) {
			
			switch(ch) {
			case 1://add employee
				 e1= new Employee();
				e1.accept();
				l1.add(e1);
				
				break;
			case 2://display all employees
				
				l1.displayAll();
				break;
			case 3:  //search by name 
				System.out.println("Enter name to search for :");
				String name=sc.next();
				LinkedList.Node n=l1.searchByName(name);
				if(n==null)
					System.out.println("Employee not found ");
				else 
					System.out.println(" Employee = "+n.getEmp().toString());
				break;
			case 4://delete employee by empid;
				System.out.println("Enter id to delete for : ");
				int id= sc.nextInt();
				l1.deleteById(id);
				
				break;
			case 5://Update salary of emp
			
				System.out.println("Enter Updated Salary");
				Double sal=sc.nextDouble();
				System.out.println("Enter id : ");
				int empid = sc.nextInt();
				l1.updateSal(sal, empid);
			
				break;
			}
		}
	}
	
}

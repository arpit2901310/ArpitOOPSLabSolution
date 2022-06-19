package com.arpit.main;

import java.util.Scanner;

import coreJava.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		System.out.println("Enter Last Name: ");
		String lname = sc.next();
		Employee e1 = new Employee(fname,lname);
		
		
		String[] department = {"Technical","Admin","Human Resource","Legal"};
		
		System.out.println("Please enter the department from the following");
		
		for (int i=0; i<department.length; i++ ) {
			System.out.println(i+1 + ". " + department[i]);
			
		}
		
		int d = sc.nextInt();
		
		e1.department = department[d-1];
		
		System.out.println("Enter company: ");
		e1.company = sc.next();
		
		e1.showCredentials();
		
		sc.close();*/
		int ch;
		String dept="";
		String email="";
		Employee emp=new Employee("Arpit","Joshi");
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please Enter the Department for the following");
	    System.out.println("1.technical\n2.admin\n3.hr\n4.legal");
	    System.out.println("Enter Your Choice:");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:dept="technical";break;
	    case 2:dept="admin";break;
	    case 3:dept="hr";break;
	    case 4:dept="legal";break;
	    }
	    Credentials cr=new Credentials();
	    email=cr.generateEmailAddress(emp,dept);
	    cr.showCredentials(emp,email);
		
	}
}


package main;

import Model.*;
import java.util.*;
import com.greatlearning.service.*;

public class Driver {
	public static void main(String args[]) {
//Take inputs the user for firstNamem Last Name , Deartment id --  1234)
	System.out.println("Enter First Name");
Scanner Sc = new Scanner(System.in);

String firstname = Sc.next();

System.out.println("Enter last Name");
Scanner sc = new Scanner(System.in);

String lastname = Sc.next();

System.out.println("Choose your department");
System.out.println("1, Technichal");
System.out.println("2, Admin");
System.out.println("3,Human REsourse");
System.out.println("4,Leaga");

int choice = sc.nextInt();
Employee emp;
 switch(choice) {
 case 1:
	 emp = new Employee(firstname,lastname, "tech" );
	 break;
 case 2:
	 emp = new Employee(firstname,lastname, "adm" );
	 break;
 case 3:
	 emp = new Employee(firstname,lastname, "hr" );
	 break;
 case 4:
	 emp = new Employee(firstname,lastname, "lg" );
	 break;
	 default:
		 System.out.println("Wrong choice");
		 return;
		 
 }
 CredendtialService cs = new CredendtialService();
	String email = cs.generateEmailAddress(emp);
	// System.out.println("Email address "+email);
	String password = cs.generatePasswarod();
	// System.out.println("Password "+password);
	cs.showCredentials(emp, email, password);
 
 


}}

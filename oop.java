package oop;
import java.util.Scanner;
public class oop {

	public static void main(String[] args) {
	String firstname, lastname, course, section;
	int year, midtermgrade, finalgrade;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter firstname: ");
	firstname = scan.nextLine();
	System.out.print("Enter lastname: ");
	lastname = scan.nextLine();
	System.out.print("Enter course: ");
	course = scan.nextLine();
	System.out.print("Enter Section: ");
	section = scan.nextLine();
	System.out.print("Enter year: ");
	year = scan.nextInt();
	System.out.print("Enter Midterm grade: ");
	midtermgrade = scan.nextInt();
	System.out.print("Enter Final grade: ");
	finalgrade = scan.nextInt();
	
	Student student = new Student(firstname, lastname, course, section, year, midtermgrade, finalgrade);
	student.introduce_self();
	student.evaluate_grade();
	  
	
	
    
		
	}

 }

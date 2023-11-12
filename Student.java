package oop;

public class Student {
   String firstname, lastname, course, section;
   int year, midtermgrade, finalgrade;
   
   Student(String firstname, String lastname, String course, String section,int year, int midtermgrade, int finalgrade){
	   this.firstname = firstname;
	   this.lastname = lastname;
	   this.course = course;
	   this.section = section;
	   this.year = year;
	   this.midtermgrade = midtermgrade;
	   this.finalgrade = finalgrade;
   }
   void introduce_self() {
	   System.out.println("My name is " + firstname + " " + lastname);
	   System.out.println("My course is " + course + " Section: " + section +" year: " + year);
   }
   void evaluate_grade() {
	   float average = (midtermgrade + finalgrade) / 2;
	   System.out.println("Your average grade is " + average);
	   if(average > 100) {
		   System.out.println("Invalid Grade");
	   }
	   else if(average <= 100) {
		   System.out.println("With Highest honors");
	   }
	   else if(average <= 97.99) {
		   System.out.println("With High honors");
	   }
	   else if(average <= 94.99) {
		   System.out.println("With honors");
	   }
	   else if(average <= 89.99) {
		   System.out.println("Passed");
	   }
	   else if(average <75) {
		   System.out.println("Failed");
		   
	   }
	   
   }
}

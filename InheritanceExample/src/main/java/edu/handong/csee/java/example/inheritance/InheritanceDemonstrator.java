package edu.handong.csee.java.example.inheritance;

/*
	 * This class demonstrates inheritance in Java. It creates an instance of the Student class, sets its name and student number, and then calls the writeOutput method to display the information.
*/
public class InheritanceDemonstrator {

	public static void main(String[] args) {	// main method is the entry point of the program
		 Student s = new Student();
		 s.setName("Warren Peace");
		 s.setStudentNumber(1234);
		 s.writeOutput();
	}

}

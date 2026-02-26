package edu.handong.csee.java.example.inheritance;

/*
 * This class represents a Student, which is a subclass of Person. 
 * It has an additional attribute studentNumber and methods to get and set the student number, as well as a method to write the output of the student's information. 
 * It also has a method to compare two Student objects for equality based on their name and student number.
*/
public class Student extends Person{
	
	private int studentNumber;
	public Student()    {	// default constructor
		super();        
		studentNumber = 0;//Indicating no number yet    
	}
	
	public Student(String initialName, int initialStudentNumber){	// constructor with parameters
		super(initialName);        
		studentNumber = initialStudentNumber;    
	}
	
	public void reset(String newName, int newStudentNumber) {	// method to reset the name and student number of the student
		setName(newName);        
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {	// method to get the student number of the student
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {	// method to set the student number of the student
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() {	// method to write the name and student number of the student
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber); 
	}
	
	public boolean equals(Student otherStudent) {	// method to compare the name and student number of this student with another student
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	} 

}

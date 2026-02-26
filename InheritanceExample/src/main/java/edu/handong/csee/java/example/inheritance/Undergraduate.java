package edu.handong.csee.java.example.inheritance;

/*
	 * Undergraduate.java
 * This class represents an undergraduate student, which is a subclass of the Student class. It has an additional property called level, which indicates the year of the undergraduate student (1 for freshman, 2 for sophomore, 3 for junior, or 4 for senior). The class also has methods to get and set the level, as well as a method to write the output of the undergraduate student's information and a method to compare two undergraduate students for equality.

*/

public class Undergraduate extends Student { // Undergraduate class is a subclass of Student class, which means it
												// inherits all the properties and methods of Student class and can also
												// have its own properties and methods.
	private int level; // 1 for freshman, 2 for sophomore
						// 3 for junior, or 4 for senior.

	public Undergraduate() { // default constructor
		super();
		level = 1;
	}

	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) { // constructor with
																							// parameters
		super(initialName, initialStudentNumber);
		setLevel(initialLevel); // checks 1 <= initialLevel <= 4
	}

	public void reset(String newName, int newStudentNumber, int newLevel) { // method to reset the name, student number,
																			// and level of the undergraduate student
		reset(newName, newStudentNumber); // Student's reset
		setLevel(newLevel); // Checks 1 <= newLevel <= 4
	}

	public int getLevel() { // method to get the level of the undergraduate student
		return level;
	}

	public void setLevel(int newLevel) { // method to set the level of the undergraduate student
		if ((1 <= newLevel) && (newLevel <= 4))
			level = newLevel;
		else {
			System.out.println("Illegal level!"); // if the new level is not between 1 and 4, print an error message and
													// exit the program
			System.exit(0);
		}
	}

	public void writeOutput() { // method to write the name, student number, and level of the undergraduate
								// student
		super.writeOutput();
		System.out.println("StudentLevel: " + level);
	}

	public boolean equals(Undergraduate otherUndergraduate) { // method to compare the name, student number, and level
																// of this undergraduate student with another
																// undergraduate student
		return equals((Student) otherUndergraduate) && (this.level == otherUndergraduate.level);
	}
}

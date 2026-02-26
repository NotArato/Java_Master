package edu.handong.csee.java.example.inheritance;

public class Person {
	private String name;

	public Person() {	// default constructor
		name = "No name yet";
	}
	public Person(String initialName)    {	// constructor with parameters 
		name = initialName;    }

	public void setName(String newName) {	// method to set the name of the person
		name = newName;    
	} 

	public String getName() {	// method to get the name of the person
		return name;
	} 

	public void writeOutput() {	// method to write the name of the person
		System.out.println("Name: " + name);
	} 

	public boolean hasSameName(Person otherPerson) {	// compares the name of this person with the name of another person
		return this.name.equalsIgnoreCase(otherPerson.name);
	} 
}
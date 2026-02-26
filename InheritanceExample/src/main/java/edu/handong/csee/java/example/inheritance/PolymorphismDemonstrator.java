package edu.handong.csee.java.example.inheritance;

public class PolymorphismDemonstrator {
	public static void main(String[] args) {	// main method is the entry point of the program
		Person[] people = new Person[4];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people) {
			System.out.println("Student Name: " + p.getName());
			
			// we can call getLevel only in Undergraduate by casting p (Person).
			// However, before cating we need to check if p is actually Undergraduate type by using 'instanceof'
			if(p instanceof Undergraduate){ 
				Undergraduate studentObj = (Undergraduate) p;
				System.out.println("Student Level: " + studentObj.getLevel());
			}
			System.out.println();
		}
		
		Undergraduate ug = new Undergraduate("Nam, JC", 1111, 4);	// creating an Undergraduate object and assigning it to a variable of type Undergraduate
		Student st = ug;
		Person ps = ug;
		Object obj = ug;
		
		st.writeOutput();
		ps.writeOutput();
		System.out.println(obj.toString());	// toString() method is defined in Object class, so it can be called on obj which is of type Object

	}
}
package edu.pip.java.oop.writingMethod;
import java.util.Scanner;
public class DollarFormatFirstTryDriver {

	public static void main (String [] args)
	 {
	 double amount;
	 String response;
	 Scanner keyboard = new Scanner (System.in);
	 System.out.println ("Testing DollarFormatFirstTry.write:");
	 do {
	 System.out.println ("Enter a value of type double:");
	 amount = keyboard.nextDouble ();	// Getting input
	 DollarFormatFirstTry.write (amount);
	 System.out.println ();
	 System.out.println ("Test again?");
	 response = keyboard.next ();
	 }
	 while (response.equalsIgnoreCase ("yes"));	// Checking if user input Yes 
	 System.out.println ("End of test.");
	 }
 

}

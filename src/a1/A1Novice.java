package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		//creating scanner to read for input from console
		Scanner scan = new Scanner(System.in);

		//allowing the next integer input by the user to be recorded by scanner
		int count = scan.nextInt() + 1;
		
		//creating a string array which will hold the names of the customers, length determined by first integer
		String[] customers = new String[count];
		
		//reading values into the string array
		for (int i=0; i<=customers.length; i++) {
			
			//creating two string arrays, one which will hold the first names and other which will hold last names. Length based on amount of customers.
			String[] firstName = new String[customers.length];
			
			//first name will be next string input through scanner
			firstName[i] = scan.next();
			
			// same for last name
			String[] lastName = new String [customers.length];
			lastName[i] = scan.next();
			
			//creating an integer that will hold the number of items for the next for loop.
			int numberOfItems = scan.nextInt();
			
			//creating an double array which will hold the total for each customer.
			double[] total = new double[numberOfItems];
			
			//new for loop which will process the total cost for each customer
			for (int i1=0; i1<numberOfItems; i1++) {
				
				//scanning for the number of the item, name, and price of the item.
				int numSpecificItem = scan.nextInt();
				String nameOfItem = scan.next();
				double price = scan.nextDouble();
				
				//calculating the total for said customer.
				total[i] = price * numSpecificItem + total[i];
				
			}
			
			// printing out the first initial of their name by using the charAt feature and picking the first letter
			// then assembling the rest by using the last name and a series of concatenations along with the total.
			System.out.print(firstName[i].charAt(0) + "." + lastName[i] + " " + total[i]);
		}
		
		// closing the scanner as it is no longer used.
		scan.close();
		
	}
}

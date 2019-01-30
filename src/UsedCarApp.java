import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsedCarApp {
	
	
	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();

		
		cars.add( new UsedCar("Ford", "Mustang", 1965, 41125.00, 152678) );
		cars.add( new UsedCar("Pontiac", "GTO", 1969, 37000, 125678) );
		cars.add( new UsedCar("Chevrolet", "Malibu", 1977, 23650.95, 172734) );
		cars.add( new Car("Ford", "F-150", 2018, 18990) );
		cars.add( new Car("Cadillac", "Escalade", 2019, 75195.90) );
		cars.add( new Car("Chevrolet", "Camaro", 2019, 26125.65) );
		cars.add( new Car("Dodge", "Charger", 2019, 29220) );
			
		
		Scanner scnr = new Scanner(System.in);
		boolean continueCmd = true; // at least once, show inventory and ask for order input from user

		while (continueCmd) {
			
			//Prints the Headers for the list
			System.out.println("Current Inventory:");
			System.out.printf("%-3s %-14s %-14s %-14s %-14s %-12s %-14s \n\n", " ", "Make", "Model", "Year", "Price", "Type", "Mileage");
			
			// Prints the current list of cars.
			int i = 1;
			for (Car thisCar : cars) {		
			System.out.println(i + "." + thisCar );
			i ++;
			}
			
			System.out.println(i + ".  quit"); // option for user to select to quit
			int userChoice = Validator.getInt(scnr, "\n Which car would you like? Please select a number. \n", 1, 8);
			
			if (userChoice == i) {
				System.out.println("Thank you for your interest. Please check back -- our inventory changes daily.");
				break;  //break out of the loop if the user chooses to quit
			}
			
			System.out.println( cars.get(userChoice -1) + "\n");  //print the fields for the user's selected car choice

			String userDecision = Validator.getStringMatchingRegex(scnr, "Would you like to buy this car? (yes/no) \n", "(yes)|(no)");
			if ( userDecision.contentEquals("yes") ) {
			
				cars.remove( (userChoice -1) );   //removes the user's choice from the cars list
				System.out.println("Great! Please expect a follow-up from a member of our friendly sales staff shortly. \n");
				}
		
		} 		
		
	}
}

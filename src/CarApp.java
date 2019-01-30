import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarApp {
	
	static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console.");	
		int userNum = Validator.getInt(scnr, "How many cars are you entering?", 0, 100);
				
		for (int i = 0; i < userNum; i++) {
						
			Car car = new Car();  //create a new object of the Car class for each input
			
			System.out.println("Please enter the make of the vehicle:");
			car.setMake( scnr.nextLine() );
			
			System.out.println("Please enter the model of the vehicle:");
			car.setModel( scnr.nextLine() );
			
			System.out.println("Please enter the year of the vehicle:");
			car.setYear( scnr.nextInt() );
			
			System.out.println("Please enter the price of the vehicle:");
			car.setPrice( scnr.nextDouble() );
			scnr.nextLine(); //clear the scanner
				
			cars.add(car);
		}	
			
		scnr.close();
				
		System.out.println("Current Inventory:");
		System.out.printf("%-1s %-14s %-14s %-14s %-14s\n", " ", "Make", "Model", "Year", "Price");
		
		for (Car thisCar : cars) {
			
			System.out.println( thisCar );
		}
		
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsedCarApp {
	
	static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {
		
		cars.add( new UsedCar("Ford", "Mustang", 1965, 41125.00, 152678) );
		cars.add( new UsedCar("Pontiac", "GTO", 1969, 37000, 125678) );
		cars.add( new UsedCar("Chevrolet", "Malibu", 1977, 23650.95, 172734) );
		cars.add( new Car("Ford", "F-150", 2018, 18990) );
		cars.add( new Car("Cadillac", "Escalade", 2019, 75195.90) );
		cars.add( new Car("Chevrolet", "Camaro", 2019, 26125.65) );
		cars.add( new Car("Dodge", "Charger", 2019, 29220) );
		
		System.out.println("Current Inventory:");
		System.out.printf("%-3s %-14s %-14s %-14s %-14s %-12s %-14s \n", " ", "Make", "Model", "Year", "Price", "Type", "Mileage");
		
		int i = 1;
		for (Car thisCar : cars) {
			
			System.out.println(i + "." + thisCar );
			i ++;
		}
		
		
	}

}

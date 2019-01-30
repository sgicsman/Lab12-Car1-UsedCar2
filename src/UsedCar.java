
public class UsedCar extends Car {
	
	private double mileage;

	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format( "%-1s %-14s %-14s %-14s %-1s %-12s %-12s %-14s", " ", getMake(), getModel(), getYear(), "$", getPrice(), "(USED)", mileage);
	}
	

}

package ba.object.classes.begin;

public class Car {

	public static void main(String[] args) {

		Car renault = new Car("Clio", Data.RENAULT);
		Car renault2 = new Car("Clio", Data.RENAULT);
		renault.setFuel(Data.FUEL_BENZIN);
		
		Car[] cars = new Car[2];
		cars[0] = renault;
		cars[1] = renault2;
		
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getFuel() != null) {
				if(cars[i].getFuel().equals(Data.FUEL_BENZIN)) {
					System.out.println(cars[i].toString());
				}
			}
		}
		
		//System.out.println(Arrays.toString(cars));
		
		//System.out.println(renault.toString());
		
		
		
		//System.out.println(renault.toString());

	}

	private String name;
	private String manufacturer;
	private int year;
	private String fuel;
	private double engine;
	private double consuption;
	private double accelerationTo100;
	private double price;

	public Car(String name, String manufacturer, int year, String fuel, double engine, double consumption,
			double accelerationTo100, double price) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.year = year;
		this.fuel = fuel;
		this.engine = engine;
		this.consuption = consumption;
		this.accelerationTo100 = accelerationTo100;
		this.price = price;
	}

	public Car(String name, String manufacturer) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.year = 2003;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public double getConsumption() {
		return consuption;
	}

	public void setConsumption(double consumption) {
		this.consuption = consumption;
	}

	public double getAccelerationTo100() {
		return accelerationTo100;
	}

	public void setAccelerationTo100(double accelerationTo100) {
		this.accelerationTo100 = accelerationTo100;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		String s = "";
		s += "Car" + name + "\n";
		s += "Year" + year + "\n";
		s += "Engine" + engine + "\n";
		s += "Fuel" + fuel;
		return s;
	}
}

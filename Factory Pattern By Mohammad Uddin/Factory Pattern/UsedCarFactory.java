
public class UsedCarFactory {

	public Car getVehicle(String typeOfCar) {
		
		if(typeOfCar == null || typeOfCar.isEmpty()) return null;
		
		switch(typeOfCar) {
		case "Sedan":
			return new Sedan();
		case "SUV":
			return new SUV();
		case "Truck":
			return new Truck();
		default:
			throw new IllegalArgumentException("Unknown type of car -> "+typeOfCar);
		}
		
		
	}
	
}


public class UsedCarDealership {

	public static void main(String[] args) {
		
		UsedCarFactory carFactory = new UsedCarFactory();
		Car newCar=carFactory.getVehicle("SUV");
		newCar.drive();
	}
}


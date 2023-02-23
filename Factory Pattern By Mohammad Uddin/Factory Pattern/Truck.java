
public class Truck implements Car{

	int weightCapacity=500;
	
	@Override
	public void drive() {
		System.out.println("Driving a Truck now with WeightCapacity: "+weightCapacity);
		
	}
}

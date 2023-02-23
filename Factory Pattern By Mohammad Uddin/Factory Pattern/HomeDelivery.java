
public class HomeDelivery {

	String Address;
	int time;
	String deliveryDate;

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public HomeDelivery(String address, int time, String deliveryDate) {
		super();
		Address = address;
		this.time = time;
		this.deliveryDate = deliveryDate;
	}
	
	boolean deliverVehicle(Car car,String address) {
		if(address.isEmpty())
			return false;
		else
			System.out.println("Delivering car now>.");
		return true;
					
	}
	
	
}

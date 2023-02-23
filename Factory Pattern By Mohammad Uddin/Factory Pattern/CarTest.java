

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CarTest {

	

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@Test	  
	public void CarDelivery() {
		HomeDelivery hmd=new HomeDelivery(null, 0, null);
		assertNotNull(hmd.deliverVehicle(null, "South LA, 3445"));
		
	}
	
	@Test  
	public void TestCarDealership(){
		
		System.out.println("Test Car object Creation");
		UsedCarFactory obj=new UsedCarFactory();
		assertNotNull(obj.getVehicle("Truck"));
		
	} 
	
}

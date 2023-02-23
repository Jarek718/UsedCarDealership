package IteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoList
{
	private List<Car> Cars = new ArrayList<Car>();
	
	private String[] RNGMakeList = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Sigma"};
	private String[] RNGModelList = {"SEDAN", "COUPE", "SPORTS CAR", "STATION WAGON", "HATCHBACK", "CONVERTIBLE", "SPORT-UTILITY VEHICLE", "PICKUP TRUCK"};
	private short[] RNGYearList = {1989, 1994, 1999, 2005, 2006, 2009, 2011, 2015, 2020, 2022};
	private double[] RNGPriceList = {12300.99, 56300.99, 32500.00, 43600.50, 78900.00, 32200.00};
	
	public DemoList()
	{
		RNGList();
	}

	public List<Car> getCars()
	{
		return Cars;
	}

	public void setCars(List<Car> cars)
	{
		Cars = cars;
	}
	
	public DemoCar RNGCar()
	{
		
		String RNGMake = RNGMakeList[new Random().nextInt(RNGMakeList.length)];
		String RNGModel = RNGModelList[new Random().nextInt(RNGModelList.length)];
		short RNGYear = RNGYearList[new Random().nextInt(RNGYearList.length)];
		double RNGPrice = RNGPriceList[new Random().nextInt(RNGPriceList.length)];
		return new DemoCar(RNGMake, RNGModel, RNGYear, RNGPrice);
	}
	
	private void RNGList()
	{
		int index = 25;
		
		for(int i = 0; i<index; i++)
		{
			DemoCar dc = RNGCar();
			dc.setMake(dc.getMake()+"\nCar: "+i);
			Cars.add(dc);
		}
	}
}

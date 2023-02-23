package IteratorPattern;

import java.util.List;

public class CarRepo implements Container
{
	private  List<Car> Cars;
	
	public CarRepo()
	{
		DemoList DL =  new DemoList();
		Cars = DL.getCars(); //This would be replace by the real list of cars
	}
	
	//For unit testing
	public CarRepo(List<Car> cars)
	{
		Cars = cars;
	}
	
	@Override
	public Iterator getIerator()
	{
		return new CarIterator();
	}
		
	private class CarIterator implements Iterator
	{
		int index;
		
		@Override
		public boolean hasNext()
		{
			if(index < Cars.size())
			{
	            return true;
	        }
			return false;
		}

		@Override
		public Car next()
		{
			if(this.hasNext()){
	            return Cars.get(index++);
	         }
			return null;
		}			
	}

	//For unit testing
	public List<Car> getCars()
	{
		return Cars;
	}

	//for unit testing
	public void setCars(List<Car> cars)
	{
		Cars = cars;
	}
}

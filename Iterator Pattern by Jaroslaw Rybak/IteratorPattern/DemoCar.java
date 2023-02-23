package IteratorPattern;

public class DemoCar implements Car
{
	private String Make;
	private String Model;
	private short Year;
	private double Price;
	
	public DemoCar(String make, String model, short year, double price)
	{
		Make = make;
		Model = model;
		Year = year;
		Price = price;
	}
	
	@Override
	public String getMake()
	{
		return Make;
	}

	@Override
	public void setMake(String make)
	{
		Make = make;

	}

	@Override
	public String getModel()
	{
		return Model;
	}

	@Override
	public void setModel(String model)
	{
		Model = model;
	}

	@Override
	public short getYear()
	{
		return Year;
	}

	@Override
	public void setYear(short year)
	{
		Year = year;
	}

	@Override
	public double getPrice()
	{
		return Price;
	}

	@Override
	public void setPrice(double price)
	{
		Price = price;
	}
	
	public String toString()
	{
		return "Make: "+Make+"\nModel: "+Model+"\nYear: "+Year+"\nPrice: "+Price;
	}

}

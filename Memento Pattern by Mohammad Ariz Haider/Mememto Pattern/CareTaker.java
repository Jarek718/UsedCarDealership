package Memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker //adds more save states as list is changed
{
	private List<Memento> CarList = new ArrayList<Memento>();
	private List<Memento> CopyCarLList = (List)(((ArrayList)CarList).clone());
	
	public void add(Memento mem)
	{
		CarList.add(mem); // 
		System.out.println("List of Cars:" + CarList + "\n");
	}

	public Memento get(int index)
	{
		return CarList.get(index);
	}
}
 
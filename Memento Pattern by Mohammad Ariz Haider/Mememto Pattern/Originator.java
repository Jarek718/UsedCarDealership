package Memento;
public class Originator //Creates the save time
{
	DemoList CList; //CList = Car List
	
	public DemoList getState()
	{
		return CList;
	}
	
	public void setState(DemoList  CList) // saves a sate of the current list
	{
		this.CList = CList;
	}
	
	public Memento saveStateToMemento()
	{
		return new Memento(CList);
	}
	
	public void getStateFromMemento(Memento memento)// loads  or revert back saved state
	{
		CList = memento.getState();
	}
	
}

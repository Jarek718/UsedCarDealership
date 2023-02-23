package Memento;
public class Memento //save state
{
	private DemoList CList;
	
	public Memento (DemoList CList)
	{
		super();
		this.CList = CList;
	}
	public DemoList getState()
	{
		return CList;
	}
	public void setList(Memento memento)
	{
		CList = memento.getState();
	}
	
	public String toString()
	{
		return "Add the Cars to the List: " + CList;
	}
}

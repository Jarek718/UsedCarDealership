package Memento;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MementoTest
{
	DemoList CList;
	Originator Org = new Originator ();
	CareTaker CareT = new CareTaker();
	
	@BeforeClass // runs at very starting of iteration
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("check if a state can be saved and loaded");
	}

	

	@Test
	public void saveSate() //FIrst Test : saves a state
	{
		Org.setState(CList); //adds a default state
	}
	
	@Test
	public void test2() //Checks if it can go back to last saved state
	{
		CareT.add(Org.saveStateToMemento());
	}
	

}

package IteratorPattern;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarRepoTest
{
	private static DemoList DL;
	private CarRepo CR;
	private Iterator ier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		//Generating RNG list for testing.
		DL = new DemoList();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		//Making a clone for each test to not edit original list
		List<Car> ListClone =  new ArrayList<Car>();
		for(int i = 0;i<DL.getCars().size();i++)
		{
			ListClone.add(DL.getCars().get(i));
		}
		CR = new CarRepo(ListClone);
		
		ier = CR.getIerator();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	//Testing Clone: Testing if editing List generator edits usable list
	@Test(expected=IndexOutOfBoundsException.class)
	public void testSetCars() 
	{
		DL.getCars().add(DL.RNGCar());
		
		assertNull("Testing if editing original list will edit CarRepo list.", CR.getCars().get(DL.getCars().size()));
	}
	
	//Testing Clone: testing if both lists are the same
	@Test
	public void test_Lists() 
	{
		for(int i =0; i<DL.getCars().size()||i<CR.getCars().size();i++)
		{
			assertEquals("Testing Car: "+i+" If failed scrap all tests",DL.getCars().get(i),CR.getCars().get(i));
		}
	}
	
	//Testing Iterator: Testing if 2 iterators are the same
	@Test
	public void testing_Diff_Iterators()
	{
		assertFalse("Testing if 2 Iterators are the same.",ier.equals(CR.getIerator()));
	}
	
	//Testing Iterator: Testing if 2 iterators give the same output
	@Test
	public void testing_Diff_output()
	{
		Iterator newIer = CR.getIerator();
		while(ier.hasNext()||newIer.hasNext())
		{
			assertEquals("Testing same list but diff iterator output.",ier.next(),newIer.next());
		}
	}
	
	//Testing hasNext: Testing if the first hasNext returns true
	@Test
	public void hasNext_BaseCase() 
	{
		assertTrue("Teting hasNext base case",ier.hasNext());
	}

	//Testing hasNext: Testing if ending hasNext returns false
	@Test
	public void hasNext_OverFlow() 
	{
		while(ier.hasNext())
		{
			ier.next();
		}
		
		assertFalse("Testing hasNext overflow",ier.hasNext());
	}

	//Testing Next: Testing all Cars at once
	@Test
	public void next_compared_orginal_List() 
	{		
		for(int i =0; i<DL.getCars().size()||i<CR.getCars().size();i++)
		{
			assertEquals("Testing Car: "+i,DL.getCars().get(i),ier.next());
		}
	}
}

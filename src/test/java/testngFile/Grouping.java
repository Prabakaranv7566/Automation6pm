package testngFile;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="init")
	public void intialtest()
	{
		System.out.println("Initial test");
	}
	@Test(groups="init1")
	public void initialtest1()
	{
		System.out.println("Initial test1");
	}

}

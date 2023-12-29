package selenium;

import org.testng.annotations.Test;

public class TestNG {

	@Test(priority=1,invocationCount=3)
	public void TestClass()
	{
		System.out.println("first print");
	}
	@Test(priority=2)
	public void SecondPrint()
	{
		System.out.println("second print");
	}
	@Test(priority=3)
	public void ThirdPrint()
	{
		System.out.println("third print");
	}
}

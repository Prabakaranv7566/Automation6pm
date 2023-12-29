package testngFile;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
		System.out.println(System.currentTimeMillis());
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
		System.out.println(System.currentTimeMillis());
	}
}

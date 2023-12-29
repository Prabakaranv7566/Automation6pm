package testngFile;

import org.testng.annotations.Test;

public class ParameterTestNG {
	
	@Test(groups="smoke")
	public void smokeTest()
	{
		System.out.println("This is smoke");
	}
	@Test(groups="regres")
	public void regression()
	{
		System.out.println("This is regression");
	}

}

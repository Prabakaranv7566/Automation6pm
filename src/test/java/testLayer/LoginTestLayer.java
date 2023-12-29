package testLayer;



import org.testng.Assert;
import org.testng.annotations.Test;
import driverFactory.BaseClass;
import pageLayer.LoginPage;

public class LoginTestLayer extends LoginPage {
	public LoginPage l=new LoginPage();
	
	@Test(priority=0)
	public void PerformLogin()
	{
		 l=new LoginPage();
		l.doLogin("Admin", "admin123");
		
	}
	@Test(priority=1)
	public void checkForgotTest()
	{
		boolean flag = l.checkforgotPassword();
		Assert.assertTrue(flag);
	}

}

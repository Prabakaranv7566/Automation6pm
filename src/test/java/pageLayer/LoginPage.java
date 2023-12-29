package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import driverFactory.BaseClass;


public class LoginPage extends BaseClass{
	
	
	By name=By.name("username");
	By psw=By.name("password");
	By btn=By.xpath("//button[@type='submit']");
	By forgot_Pwd=By.xpath("//p[text()='Forgot your password? ']");
	By dash=By.xpath("//h6[text()='Dashboard']");
	
	public void doLogin(String user,String pass)
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(name);
		username.sendKeys(user);
		WebElement pswd = driver.findElement(psw);
		pswd.sendKeys(pass);
		driver.findElement(btn).click();
	}
	public boolean checkforgotPassword()
	{
		WebElement forgotpassword = driver.findElement(forgot_Pwd);
		boolean flag = forgotpassword.isDisplayed();
		return flag;
	}
}

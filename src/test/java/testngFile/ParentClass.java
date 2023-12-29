package testngFile;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	WebDriver driver;
	@Test(priority=-1)
	public void DriverInit()
	{
		System.out.println("DriverInit");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "OrangeHRM");
		System.out.println("Title is " + getTitle);
	}
	
	@Test(priority=0, dataProvider="datas")
	public void login(String user, String pwd) throws InterruptedException
	{
		System.out.println("login run");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement userLogin = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement userPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userLogin.sendKeys("Admin");
		userPass.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=1)
	public Object[][] datas()
	{
		Object[][] data= {{"praba","karan"},{"Admin","admin123"}};
		return data;
	}
	
	@Parameters({"fName"})
	@Test(priority=12)
	public void Recruitment(String fName) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys(fName);
		Thread.sleep(2000);
		
		
	}
}

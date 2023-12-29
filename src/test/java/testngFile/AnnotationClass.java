package testngFile;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationClass {
	WebDriver driver;
	
	
	@BeforeTest
	public void init()
	{
		System.out.println("init");	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");		
	}
	
	@Test(priority=1)
	public void init1()
	{
		System.out.println("init1");	
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Google");
	}
	
	@Parameters({"open1"})
	@Test(priority=2)
	public void init2(String open1)
	{
		System.out.println("init2");
		WebElement inputValue = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		inputValue.sendKeys(open1);
		inputValue.sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void init3() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.quit();
		
	}

}

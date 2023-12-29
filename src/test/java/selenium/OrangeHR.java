package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHR {
	
	public static void main(String arg[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement newtab = driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
		newtab.sendKeys("facebook");
		newtab.sendKeys(Keys.ENTER);
		WebElement fbclick = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		fbclick.click();
		//Thread.sleep(3000);
		WebElement fblogin = driver.findElement(By.id("email"));
		fblogin.sendKeys("9659408601");
		WebElement fbpass = driver.findElement(By.id("pass"));
		fbpass.sendKeys("Prabaishu@21");
		fbpass.sendKeys(Keys.ENTER);
		WebElement fbsearch = driver.findElement(By.xpath("//a[@aria-label='Video']"));
		fbsearch.sendKeys(Keys.ENTER);
		//fbsearch.sendKeys("Chandrayan 3");
		//fbsearch.sendKeys(Keys.ENTER);
	}

}

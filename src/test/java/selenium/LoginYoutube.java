package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginYoutube {
	
	public static void main(String Args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opengatewaytamil.blogspot.com");
		driver1.get("https://www.youtube.com/");
		driver1.findElement(By.linkText("Sign in")).click();
		WebElement email = driver1.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("vpraba843@gmail.com");
		email.sendKeys(Keys.ENTER);
		
	}

}

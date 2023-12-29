package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
	}

}

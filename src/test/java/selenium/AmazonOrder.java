package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOrder {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		//String oldWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		driver.findElement(By.xpath("//span[text()='Mobiles & computer accessories']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Best-selling Security & Surveillance Cameras']")).click();
		driver.findElement(By.xpath("//span[text()='Trueview 4G Sim 4Mp Solar Powered CCTV Security Camera with Solar Panel | Surveillance for Agriculture | Remote Area | Construction Site | Garden (4MP Solar Mini PTZ)']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String win:windowHandles)
		{
			driver.switchTo().window(win);
			System.out.println("welcome");
		}		
		WebElement findElement = driver.findElement(By.xpath("//select[@name='quantity']"));
		Select s=new Select(findElement);
		
		s.selectByIndex(2);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	}

}

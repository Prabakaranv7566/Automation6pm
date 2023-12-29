package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.xpath("//button[@id='modern']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//div/button)[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("hey praba");
		Thread.sleep(2000);
		alt2.accept();
		
	}

}

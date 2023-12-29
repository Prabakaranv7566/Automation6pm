package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and @style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-5'])/input")).sendKeys("Welcome Praba");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
		driver.switchTo().alert().accept();
		
	}

}

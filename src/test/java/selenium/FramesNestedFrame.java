	package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNestedFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"#Single\"]")).click();
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input")).sendKeys("direct send");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//input")).sendKeys("direct send");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"Windows.html\"]")).click();
		
		
	}

}

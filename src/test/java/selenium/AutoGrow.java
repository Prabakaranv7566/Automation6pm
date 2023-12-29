package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoGrow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/index.html");
		driver.findElement(By.id("growonloadchallenge")).click();
		driver.findElement(By.id("growbutton"));
		
	}

}

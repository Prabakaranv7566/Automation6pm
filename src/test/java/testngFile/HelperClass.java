package testngFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass 
{
	
 static WebDriver driver1; 
	public static WebDriver init(String browsername )
{
		
		switch(browsername )
		{
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver1 = new ChromeDriver();
			break;
			
			
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver1= new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver1 = new FirefoxDriver();
			break;
		}
		
		return driver1;
	}

}


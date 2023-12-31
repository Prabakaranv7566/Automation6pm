package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreen {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opengatewaytamil.blogspot.com/");
		TakesScreenshot scr=((TakesScreenshot)driver);
		File scrFile = scr.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\RAMAC\\eclipse-workspace\\Automation6pm\\screenshot\\screen.png");
		FileUtils.copyFile(scrFile, destFile);
		driver.close();
		
	}

}

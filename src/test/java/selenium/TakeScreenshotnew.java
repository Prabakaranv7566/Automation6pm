package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TakeScreenshotnew {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		TakesScreenshot scr=((TakesScreenshot)driver);
		File scrFile = scr.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\RAMAC\\eclipse-workspace\\Automation6pm\\screenshot\\scr.png");
		FileUtils.copyFile(scrFile, destFile);
		driver.close();
		
	}

}

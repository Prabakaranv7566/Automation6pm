package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLast {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement lang = driver.findElement(By.id("lang"));
		Select s = new Select(lang);
		List<WebElement> list1 = s.getOptions();
		s.selectByIndex(2);
		Thread.sleep(2000);
		for(WebElement ele:list1)
		{
			String text = ele.getText();
			if(text.equals("C#"))
			{
				s.selectByVisibleText("C#");
			}
			System.out.println(text);
		}
	}

}

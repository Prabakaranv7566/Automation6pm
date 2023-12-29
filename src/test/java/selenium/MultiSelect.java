package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement s = driver.findElement(By.id("superheros"));
		Select s1=new Select(s);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		s1.selectByValue("ek");
		s1.selectByVisibleText("Ghost Rider");
		List<WebElement> options = s1.getOptions();
		for(WebElement ele: options)
		{
			String text = ele.getText();
			if(text.equals("Thor"))
			{
				s1.selectByVisibleText("Thor");
			}
			System.out.println(text);
		}
	}

}
